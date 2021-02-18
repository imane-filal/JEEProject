package fstt.lsi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fstt.lsi.Service.MouvementService;

@RestController
@RequestMapping({ "/mouvements" })
public class MouvementController {
	
	public  MouvementController() {}
	
	@Autowired
	private MouvementService mvmService;
	
	@Autowired
	public MouvementController(MouvementService mvmService) {
		super();
		this.mvmService = mvmService;
	}
	
	@GetMapping(value="/getMouvement")
	public List<String> getAllMouvement(){
		
		//MouvementService mvmService = new MouvementService();
		return mvmService.getMouvement();
		
	}
	
	@GetMapping(value="/mouvement/{actId}")
	public List<String> getMouvementByActId(@PathVariable("actId")String actId){

	 return mvmService.getMouvementByActiviteId(actId);
	 }

	

	
	
}
