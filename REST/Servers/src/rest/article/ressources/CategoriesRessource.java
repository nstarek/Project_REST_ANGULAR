package rest.article.ressources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;


import javax.ws.rs.core.MediaType;
import rest.article.dao.MainDao;
import rest.article.model.Article;
import rest.article.model.Categorie;

@Path("/categorie")
public class CategoriesRessource {
	@Context
    UriInfo uriInfo;
    @Context
    Request request;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Categorie> getCategories() {
        List<Categorie> categories = new ArrayList<>();
        for(Categorie c: MainDao.instance.getModel().values()) {
        	categories.add(c);
        }
        return categories;
    }
    
    @Path("/{nom}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Categorie getCategories(@PathParam("nom") String nom){	
    	for(Categorie x:MainDao.instance.getModel().values()) {
    		if (x.getNom().equals(nom))
    			return x;
    	}
    	return null;
    }
    
    @Path("/{nom}/SousCategorie")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Categorie> getSousCategories(@PathParam("nom") String nom){	
    	for(Categorie x:MainDao.instance.getModel().values()) {
    		if (x.getNom().equals(nom)) {
    			return x.getSousCategorie();
    		}
    			
    	}
    	return null;
    }
    
    @Path("/{nom_parent}/SousCategorie/{nom}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Categorie getSousCategorie(@PathParam("nom_parent") String nom_parent,
    		@PathParam("nom") String nom){	
    	for(Categorie x:MainDao.instance.getModel().values()) {
    		if (x.getNom().equals(nom_parent)) {
    			for (Categorie y:x.getSousCategorie()) {
    				if(y.getNom().equals(nom)) {
    					return y;
    				}
    			}
    		}
    	}
    	return null;
    }
    
    @Path("/{nom_parent}/SousCategorie/{nom}/article")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Article> getArticleByCat(@PathParam("nom_parent") String nom_parent,
    									@PathParam("nom") String nom){	
    	for(Categorie x:MainDao.instance.getModel().values()) {
    		if (x.getNom().equals(nom_parent)) {
    			for (Categorie y:x.getSousCategorie()) {
    				if(y.getNom().equals(nom)) {
    					return y.getArticles();
    				}
    			}
    		}
    	}
    	return null;
    }


    
}