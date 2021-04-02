package rest.article.dao;

import java.util.HashMap;
import java.util.Map;

import rest.article.model.Admin;



public enum AdminDao {
    instance;

    private Map<String, Admin> contentProvider_admin = new HashMap<>();

    private AdminDao() {
    	
    	Admin a = new Admin("hightech@admin.com","hightech");
    	contentProvider_admin.put("hightech@admin.com", a);
    }
    
    public Map<String, Admin> getModel(){
        return contentProvider_admin;
    }
    
    public void addAdminDao(String id, Admin adm) {
    	this.contentProvider_admin.put(id, adm);
    }
    

    public void deleteAdmin( String id) {
            this.contentProvider_admin.remove(id);       
    }
    
    
    public boolean connexion(String Email, String Password) {
    	Admin a = this.contentProvider_admin.get(Email);
    	if (a.getPassword().equals(Password)){
    		return true;
    	}
    	return false;
    }

    
}
