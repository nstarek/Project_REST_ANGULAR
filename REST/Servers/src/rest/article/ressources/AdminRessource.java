package rest.article.ressources;





import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;


import javax.ws.rs.core.MediaType;
import rest.article.dao.AdminDao;
import rest.article.model.Admin;

@Path("/admin")
public class AdminRessource {
	@Context
    UriInfo uriInfo;
    @Context
    Request request;
    
    @Path("/{email}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Admin getAdmin(@PathParam("email") String email){
       return AdminDao.instance.getModel().get(email); 
    }
    
    
    @GET
    @Path("/login/{email}/password/{password}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean login(@PathParam("email") String email , @PathParam("password") String password ){
    	return AdminDao.instance.connexion(email, password);
    }
    
    
    @DELETE
    @Path("/{email}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteAdmin(@PathParam("email") String email){
    		if(AdminDao.instance.getModel().get(email) != null) {
    			AdminDao.instance.deleteAdmin(email);
    			return Response.ok().build();
    		}
    		return Response.status(Response.Status.NOT_FOUND).build();
        }       
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Admin addAdmin(Admin admin) {
    	Response.created(uriInfo.getAbsolutePath()).build();
    	AdminDao.instance.addAdminDao(admin.getEmail(), admin);
    	return admin;
    
    }
   
   
}



    
    

