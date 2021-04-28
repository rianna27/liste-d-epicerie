package application;

public class Liste 
{
	private String departement;
	private String nom;
	private Double quantite;
	private Double prix;
	
	
	//constructeur vide
	public Liste()
	{
		this(null);
		
	}
	//Constructeur avec 2 paramètres
	public Liste(String nom)
	{
		
		this.nom=nom;
		this.departement="";
		this.quantite=0.0;
		this.prix=0.0;
	} //Getters et Setters
	
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getnom() {
		return nom;
	}
	public void setnom(String nom) {
		this.nom = nom;
	}
	
	public Double getquantite() {
		return quantite;
	}
	public void setAge(Double quantite) {
		this.quantite = quantite;
	}
	public Double getprix() {
		return prix;
	}
	public void setprix(Double prix) {
		this.prix = prix;
	}
}