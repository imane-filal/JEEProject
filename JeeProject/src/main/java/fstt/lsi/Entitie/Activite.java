package fstt.lsi.Entitie;

import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Activite")
public class Activite {
	
	@Id
	private String id;
	private String type; 
	private String temps;

	@DBRef
	private Categorie categorie;
	//@DBRef
	private Satisfaction satisfaction;
	@DBRef
	private Collection<Mouvement> mouvements = new ArrayList<>();
	
	
	public Activite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Activite(String id,String type, String temps, Categorie categorie,Collection<Mouvement> mouvements) {
		super();
		this.id = id;
		this.type = type;
		this.temps = temps;
		this.categorie = categorie;
		//this.satisfaction = satisfaction;
		this.mouvements = mouvements;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTemps() {
		return temps;
	}

	public void setTemps(String temps) {
		this.temps = temps;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Collection<Mouvement> getMouvements() {
		return mouvements;
	}

	public void setMouvements(Collection<Mouvement> mouvements) {
		this.mouvements = mouvements;
	}

	public Satisfaction getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(Satisfaction satisfaction) {
		this.satisfaction = satisfaction;
	}

	@Override
	public String toString() {
		return "Activite [id_act=" + id + ", type=" + type + ", temps=" + temps + /*", categorie=" + categorie
				+*/ ", mouvements=" + mouvements + ", satisfaction=" + satisfaction + "]";
	}
	
	
		
	
}
