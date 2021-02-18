package fstt.lsi.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fstt.lsi.Entitie.Categorie;
import fstt.lsi.Repository.CategorieRepository;
import fstt.lsi.Repository.UserRepository;

@Service
public class CategorieService {
	
    private static CategorieRepository categorieRepository;
	@Autowired
    public CategorieService( CategorieRepository categorieRepository) {
		CategorieService.categorieRepository = categorieRepository;
    }
	//@Autowired
	//private Categorie categorie;
	
	
	private List<String> list = new ArrayList<>();

	public List<String> getCategories(){
		
		List<Categorie> cats = categorieRepository.findAll();
		for (Categorie c : cats) {
			 String s = c.getName();
			 String d = c.getDescription();
			 list.add(s);
			 list.add(d);
			
		}
		return list;
	}
	
	
	public List<String> getCategorieById(String catId) {
		 // TODO Auto-generated method stub
			list.removeAll(list);
			String c = categorieRepository.findById(catId).get().getName();	
			String d = categorieRepository.findById(catId).get().getDescription();
			list.add(c);
			list.add(d);
			return list;
		 } 
		

    

}
