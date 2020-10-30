package eu.ensup.domaine;

public class Employe
{
	// Fields
	
	private String nom;
	private String prenom;
	
	// Constructors
	
	public Employe()
	{
		super();
	}

	public Employe(String nom, String prenom)
	{
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	// Properties

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getPrenom()
	{
		return prenom;
	}

	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

	@Override
	public String toString()
	{
		return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
	}
}
