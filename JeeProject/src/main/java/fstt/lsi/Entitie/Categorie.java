package fstt.lsi.Entitie;

import java.util.ArrayList;
import java.util.Collection;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component	
@Document(collection = "Categorie")
public class Categorie {
	
	@Id
	private String id;
	private String name; 
	private String description;
	
	@DBRef
	private Collection<Activite> activites = new ArrayList<>();
	
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(String id, String name, String description, Collection<Activite> activite) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.activites = activite;
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Collection<Activite> getActivites() {
		return activites;
	}


	public void setActivites(Collection<Activite> activites) {
		this.activites = activites;
	}


	@Override
	public String toString() {
		return "Categorie [id_cat=" + id + ", name=" + name + ", description=" + description + ", activites="
				+ activites + "]";
	}
	
	
	
	
	
	
	
	
	
	


	
	
	
}
