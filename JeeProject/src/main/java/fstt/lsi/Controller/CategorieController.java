package fstt.lsi.Controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fstt.lsi.Entitie.Categorie;
import fstt.lsi.Repository.CategorieRepository;
import fstt.lsi.Service.CategorieService;

@RestController
@RequestMapping({ "/categories" })
public class CategorieController {
	
	public  CategorieController() {}
	
	@Autowired
	private CategorieService categorieService;
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Autowired
	private Categorie categorie;

	
	
	public CategorieController(CategorieService categorieService) {
		super();
		this.categorieService = categorieService;
	}



	@GetMapping(value="/getCat")
	public List<String> getAllCat(){
		
		
		return categorieService.getCategories();
		
	}
	
	@GetMapping(value="/categorie/{catId}")
	public List<String> getTicketById(@PathVariable("catId")String catId){

	 return categorieService.getCategorieById(catId);
	 }
	
}
