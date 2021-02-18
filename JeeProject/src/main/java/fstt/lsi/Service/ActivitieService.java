package fstt.lsi.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fstt.lsi.Entitie.Activite;
import fstt.lsi.Entitie.Categorie;
import fstt.lsi.Repository.ActiviteRepository;
import fstt.lsi.Repository.CategorieRepository;

@Service
public class ActivitieService {

	/*@Autowired
	private ActiviteRepository activiteRepository;
	@Autowired
	private Activite activite;
	@Autowired
	private CategorieRepository categorieRepository;*/
	@Autowired
	private Activite activite;
	private static CategorieRepository categorieRepository;
	private static ActiviteRepository activiteRepository;

	@Autowired
    public ActivitieService( CategorieRepository categorieRepository,ActiviteRepository activiteRepository) {
		ActivitieService.categorieRepository = categorieRepository;
		ActivitieService.activiteRepository = activiteRepository;
    }
	
	private List<String> list = new ArrayList<>();
	private List<String> li = new ArrayList<>();
	private Collection<Activite> activites = new ArrayList<>();
	public List<String> getActivite(){
		
		List<Activite> act = activiteRepository.findAll();
		//List<Categorie> cats = categorieRepository.findAll();
		//for (Categorie c : cats) {
			for (Activite a : act) {
			     //activites.addAll(c.getActivites());
				String s = a.getType();
				 String t = a.getTemps();
				 list.add(s);
				 list.add(t);
				 }	
		//}
		return list;
	}
	
	public List<String> getActiviteByCategorieId(String catId) {
		// TODO Auto-generated method stub
		List<Activite> act = activiteRepository.findAll();
		list.removeAll(list);
			for(int j=0; j<act.size(); j++) {

				if(catId.equals(act.get(j).getCategorie().getId())) {
					String a = act.get(j).getType();
					String t = act.get(j).getTemps();
					list.add(a);
					list.add(t);
					
				}
				
				
			}
		return list;

	}
}
		 
		
		
	
