package fstt.lsi.Controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fstt.lsi.Entitie.Activite;
import fstt.lsi.Repository.ActiviteRepository;
import fstt.lsi.Service.ActivitieService;

@RestController
@RequestMapping({ "/activitie" })
public class ActiviteController {
	
	public  ActiviteController() {}
	
	@Autowired
	private ActivitieService activiteService;
	
	@Autowired
	private ActiviteRepository activiteRepository;
	
	@Autowired
	private Activite activite;

	@Autowired
	public ActiviteController(ActivitieService activiteService, ActiviteRepository activiteRepository,
			Activite activite) {
		super();
		this.activiteService = activiteService;
		this.activiteRepository = activiteRepository;
		this.activite = activite;
	}
	
	@GetMapping(value="/getAct")
	public List<String> getAllCat(){
		
		//ActivitieService activiteService = new ActivitieService();
		return activiteService.getActivite();
		
	}
	
	@GetMapping(value="/activite/{catId}")
	public List<String> getActiviteByCatId(@PathVariable("catId")String catId){

	 return activiteService.getActiviteByCategorieId(catId);
	 }

	
	
}
