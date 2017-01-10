Public Class User
{
	String nom;
	String prenom;
	String login;
	String password;

	public User(){
		ArrayList<Droits> listeDroits = new ArrayList<Droits>();
	}


Public User() {

}

Public User(String nom, String prenom, String login, String password) {
	this.nom = nom;
	this.prenom = prenom;
	this.login = login;
	this.password = password;
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

