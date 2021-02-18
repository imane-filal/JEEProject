package fstt.lsi.Entitie;

import org.bson.types.ObjectId;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Mouvement")

public class Mouvement {
	
	@Id
	private String id_mouv;
	private String nom; 
	private String descriptionm;
	private String Nfois;
	@DBRef
	private Activite activite;
	
	
	
	public Mouvement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mouvement(String nom, String descriptionm, String nfois, Activite activite) {
		super();
		this.nom = nom;
		this.descriptionm = descriptionm;
		Nfois = nfois;
		this.activite = activite;
	}



	public Activite getActivite() {
		return activite;
	}



	public void setActivite(Activite activite) {
		this.activite = activite;
	}


	public String getId_mouv() {
		return id_mouv;
	}



	public void setId_mouv(String id_mouv) {
		this.id_mouv = id_mouv;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getDescriptionm() {
		return descriptionm;
	}



	public void setDescriptionm(String descriptionm) {
		this.descriptionm = descriptionm;
	}



	public String getNfois() {
		return Nfois;
	}



	public void setNfois(String nfois) {
		Nfois = nfois;
	}


	@Override
	public String toString() {
		return "Mouvement [id_mouv=" + id_mouv + ", nom=" + nom + ", descriptionm=" + descriptionm + ", Nfois=" + Nfois
				+/* ", activite=" + activite +*/ "]";
	}



	
	
	

	
}
