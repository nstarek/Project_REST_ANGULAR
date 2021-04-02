package rest.article.ressources;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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



@Path("/articles")
public class ArticlesRessource {

    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Article> getArticlesBrowser() {
    	return MainDao.instance.getArticlesFromDao();
    }
    
    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Article getArticlesBrowser(@PathParam("id") String id) {
    	return MainDao.instance.getArticleFromDao(id);
    }
    
    
    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean addArticle(Article article) 
      {
    	article.setId(String.valueOf(MainDao.instance.getLast_id()+1));
    	String id_cat = MainDao.instance.findCategorieByName(article.getCategorie()).getId();
    	article.setCategorie(id_cat);
    	if(MainDao.instance.addArticle(article)) {
    		return true;
    	}
    	return false;
        
    }
    
    @DELETE
    @Path("/delete/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean deleteArticle(@PathParam("id") String id){
    	Article a = MainDao.instance.getArticleFromDao(id);
    	
    	if(a != null) {
    		Categorie c = MainDao.instance.findCatById(a.getCategorie());
    		if(c != null) {
    			if(c.getArticles().remove(a)) {
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
    @Path("/update")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean updateArticle(Article article) 
      {
    	
    	Article originale = MainDao.instance.getArticleFromDao(article.getId());
    	System.out.println("Originale: "+originale.getCategorie());
    	System.out.println("Rest: " +article.getCategorie());
    	if((!originale.getLibelle().equals(article.getLibelle()))&&!(article.getLibelle().equals("")))
    		originale.setLibelle(article.getLibelle());
    	
    	if(originale.getPrix()!= article.getPrix())
    		originale.setPrix(article.getPrix());
    	
    	if((!originale.getImagepath().equals(article.getImagepath()))&&(!article.getImagepath().equals("")))
    		originale.setImagepath(article.getImagepath());
   
    	if((!originale.getMarque().equals(article.getMarque()))&&(article.getMarque() != null))
    		originale.setMarque(article.getMarque());
    	return true;
        
    }
    
    

}
