package controleVersionning2;

public class Droits
{
	private int niveau;
	private String severite;
	private String nom;
	private String societe;
	
	Droits(int niveau, String severite, String nom, String societe) {
		this.niveau = niveau;
		this.severite = severite;
		this.nom = nom;
		this.societe = societe;
	}

	public int getNiveau() {
		return this.niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public String getSeverite() {
		return this.severite;
	}

	public void setSeverite(String severite) {
		this.severite = severite;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSociete() {
		return this.societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	
}