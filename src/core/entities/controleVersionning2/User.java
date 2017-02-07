package controleVersionning2;

import java.util.ArrayList;

public class User
{

	private String nom;
	private String prenom;
	private String login;
	private String password;
	private ArrayList<Droits> listeDroits;

	public User(String nom, String prenom, String login, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.listeDroits = new ArrayList<Droits>();
	}
	
	public void addDroit(Droits droit)
	{
		this.listeDroits.add(droit);
	
	}
	
	public void removeDroit(Droits droit)
	{
		this.listeDroits.remove(droit);
	}
	
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public ArrayList<Droits> getListeDroits() {
		return this.listeDroits;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}



}


