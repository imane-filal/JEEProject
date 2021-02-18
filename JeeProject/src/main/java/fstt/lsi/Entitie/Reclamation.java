package fstt.lsi.Entitie;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Reclamation {

	@Id
	private int id_rec;
	private String Texte;
	@DBRef
	private User user;
	public Reclamation() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Reclamation(String texte, User user) {
		super();
		Texte = texte;
		this.user = user;
	}


	public int getId_rec() {
		return id_rec;
	}

	public void setId_rec(int id_rec) {
		this.id_rec = id_rec;
	}

	public String getTexte() {
		return Texte;
	}

	public void setTexte(String texte) {
		Texte = texte;
	}

	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Reclamation [id_rec=" + id_rec + ", Texte=" + Texte + ", user=" + user + "]";
	}



	
	
}
