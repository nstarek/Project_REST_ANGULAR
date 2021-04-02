package rest.article.model;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Article {
	private String id;
	private String libelle;
	private String marque;
	public String categorie; //Category ID
	private Double prix;
	private String imagepath;
	private String description;

	
	public Article() {
		
	}
	
	public Article (String id, String libelle,String marque,String categorie ,Double prix, String imagepath, String description) {
		this.id = id;
		this.libelle=libelle;
		this.marque=marque;
		this.prix =prix;
		this.imagepath=imagepath;
		this.categorie = categorie;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle=libelle;
	}
	
	public String getMarque() {
		return marque;
	}
	
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public Double getPrix() {
		return prix;
	}
	
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	public String getImagepath() {
		return this.imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	
	public String getCategorie() {
		return this.categorie;
	}
	
	public void setCategorie(String categorie) {
		this.categorie= categorie;
	}
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	

	

	

	
	
	

	

	
	
	


}
