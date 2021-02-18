package fstt.lsi.Entitie;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Satisfaction {

	@Id
	private String id_sat;
	private String niveau;
	//private Activite Activitie;
	
	public Satisfaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Satisfaction(String niveau) {
		super();
		this.niveau = niveau;
		//Activitie = activitie;
	}



	public String getId_sat() {
		return id_sat;
	}

	public void setId_sat(String id_sat) {
		this.id_sat = id_sat;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	

	/*public Activite getActivitie() {
		return Activitie;
	}



	public void setActivitie(Activite activitie) {
		Activitie = activitie;
	}*/



	@Override
	public String toString() {
		return "Satisfaction [id_sat=" + id_sat + ", niveau=" + niveau + /*", Activitie=" + Activitie +*/ "]";
	}




}
