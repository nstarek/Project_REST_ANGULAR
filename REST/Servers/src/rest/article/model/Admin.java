package rest.article.model;

public class Admin {
	private String email;
	private String password;
	
	
	public Admin(String e, String p) {
		this.email=e;
		this.password = p;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setEmail(String e) {
		this.email=e;
	}
	
	public void setPassword(String p) {
		this.password=p;
	}

}
