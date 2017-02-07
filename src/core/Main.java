import java.util.ResourceBundle;

public class Main {
    public static void main(String args[]) {
        
    }
    
    public class Configuration {
    	ResourceBundle bundle = resourceBundle("domaine.properties.conf");
    	String driver = bundle.getString("sgbd.driver");
    	String mysqlUser = bundle.getString("sgbd.login");
    	String mysqlPassword = bundle.getString("sgbd.password");
    	
		private ResourceBundle resourceBundle(String string) {
			// TODO Auto-generated method stub
			return null;
		}
    }
}