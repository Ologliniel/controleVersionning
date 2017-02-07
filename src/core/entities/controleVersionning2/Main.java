package controleVersionning2;

public class Main {
	
    public static void main(String args[]) {
        User user1 = new User("toto", "toto", "toto", "toto");
        User user2 = new User("tata", "tata", "tata", "tata");
        
        Droits droit1 = new Droits(1,"fort","Admin","lefromage");
        Droits droit2 = new Droits(2,"fort","nimda","lefromage");
        Droits droit3 = new Droits(3,"faible","visiteur","Montmiraille");
        Droits droit4 = new Droits(4,"nul","poulet","braisé");
        
        user1.addDroit(droit1);
        user1.addDroit(droit2);
        user2.addDroit(droit3);
        user2.addDroit(droit4);

    }
}