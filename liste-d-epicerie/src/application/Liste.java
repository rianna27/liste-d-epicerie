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
		//Constructeur avec 1 paramètre
		public Liste(String nom)
		{
			
			this.nom=nom;
			this.departement="";
			this.quantite=0.0;
			this.prix=0.0;
		} 
		
		//Getters et Setters
		

	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getQuantite() {
		return quantite;
	}
	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	
}