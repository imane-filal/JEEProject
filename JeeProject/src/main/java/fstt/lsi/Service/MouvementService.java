package fstt.lsi.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fstt.lsi.Entitie.Activite;
import fstt.lsi.Entitie.Categorie;
import fstt.lsi.Entitie.Mouvement;
import fstt.lsi.Repository.ActiviteRepository;
import fstt.lsi.Repository.CategorieRepository;
import fstt.lsi.Repository.MouvementRepository;

@Service
@Transactional

public class MouvementService {
	
	@Autowired
	private Activite activite;
	@Autowired
	private Mouvement mouvement;
	
	
	private static CategorieRepository categorieRepository;
	private static ActiviteRepository activiteRepository;
	private static MouvementRepository mouvementRepository;
	@Autowired
	 public MouvementService( CategorieRepository categorieRepository,ActiviteRepository activiteRepository, MouvementRepository mouvementRepository) {
		MouvementService.categorieRepository = categorieRepository;
		MouvementService.activiteRepository = activiteRepository;
		MouvementService.mouvementRepository = mouvementRepository;
    }

	
	private List<String> list = new ArrayList<>();
	
	public List<String> getMouvement(){
		
		List<Activite> act = activiteRepository.findAll();
		List<Categorie> cats = categorieRepository.findAll();
		List<Mouvement> mvm = mouvementRepository.findAll();
		for (Categorie c : cats) {
			for (Activite a : act) {
				for(Mouvement m : mvm) {
					String nm = m.getNom();
					String d = m.getDescriptionm();
					String n = m.getNfois();
					list.add(nm);
					list.add(d);
					list.add(n);
					}
				}	
		}
		return list;
	}
	
	
	public List<String> getMouvementByActiviteId(String actId) {
		// TODO Auto-generated method stub
		List<Mouvement> mvm = mouvementRepository.findAll();
		list.removeAll(list);
			for(int j=0; j<mvm.size(); j++) {

				if(actId.equals(mvm.get(j).getActivite().getId())) {
					String n = mvm.get(j).getNom();
					String d = mvm.get(j).getDescriptionm();
					String f = mvm.get(j).getNfois();
					list.add(n);
					list.add(d);
					list.add(f);
					
				}
				
				
			}
		return list;

	}
	
}
