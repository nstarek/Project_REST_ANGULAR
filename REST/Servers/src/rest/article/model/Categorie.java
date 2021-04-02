package rest.article.model;

import java.util.List;

import rest.article.model.Article;

public class Categorie {
	private String id;
	private String nom_categorie;
	private List<Categorie> sous_categories;
	private List<Article> articles;
	
	
	public Categorie (String id, String nom, 
						List<Categorie> s_cat, List<Article> art) {
		
		this.id=id;
		this.nom_categorie = nom; 
		this.sous_categories = s_cat;
		this.articles = art;
	}
	
	
	public String getId() {
		return this.id;
	}
	
	public String getNom() {
		return this.nom_categorie;
	}
	

	
	public List<Categorie> getSousCategorie(){
		return this.sous_categories;
	}
	
	public List<Article> getArticles(){
		return this.articles;
	}
	
	public boolean addArticle(Article a) {
		return this.articles.add(a);
	}
	
	public void addSousCategorie(Categorie c) {
		this.sous_categories.add(c);
	}
	
	public void removeSousCategorie(Categorie c) {
		this.sous_categories.remove(c);
	}
	
	public void removeArticle(Article a) {
		this.articles.remove(a);
	}
	
	
	
	
	
	
}

	
