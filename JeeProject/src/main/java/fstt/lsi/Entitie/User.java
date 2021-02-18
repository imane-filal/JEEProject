package fstt.lsi.Entitie;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
	
	@Id
	private String id_user;
	private String username;
	private String password;
	private double poids;
	private double langueur;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public User(String username, String password, double poids, double langueur) {
		super();
		this.username = username;
		this.password = password;
		this.poids = poids;
		this.langueur = langueur;
	}



	public String getId_user() {
		return id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getLangueur() {
		return langueur;
	}

	public void setLangueur(double langueur) {
		this.langueur = langueur;
	}


	@Override
	public String toString() {
		return "User [id_user=" + id_user + ", username=" + username + ", password=" + password + ", poids=" + poids
				+ ", langueur=" + langueur  + "]";
	}



	


	
	
}

