package fr.NoPasaran.controller; 

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.NoPasaran.dao.AdminDaoImpl;
import fr.NoPasaran.dao.UserDaoImpl;
import fr.NoPasaran.entities.Utilisateur;
import fr.NoPasaran.formulaire.AdminForm;
import fr.NoPasaran.formulaire.UserForm; 
 
 
@Controller
public class MainController {
 
 
	@GetMapping(value={"", "/", "/index"})  
	public String home() { 
		return "index";
	}
	 
	@GetMapping("/contact") 
	public String contact(Model model) {
        Utilisateur utilisateur = new Utilisateur();
        model.addAttribute("utilisateur", utilisateur);
		return "contact";
	}
	
	@GetMapping("/666") 
	public String c666(Model model) {
        Utilisateur utilisateur = new Utilisateur();
        model.addAttribute("utilisateur", utilisateur);
		return "666";
	}
	
	@PostMapping("/connexion") 
	public String connexion(Model model,Utilisateur utilisateur) {
				
		UserForm form = new UserForm(new UserDaoImpl());
		form.connecterUtilisateur(utilisateur);
		
		Map<String, String> mapErreurs = form.getErreurs();
		 
		if(! mapErreurs.isEmpty()) {  
			model.addAttribute("mapErreurs", mapErreurs);
			return "contact";   
		}
				
		return "contact";
	}
	  
	@PostMapping("/666")    
	public String connexion_666(Model model,Utilisateur utilisateur) {
		
		AdminForm form = new AdminForm(new AdminDaoImpl());
		form.connecterUtilisateur(utilisateur);
		
		Map<String, String> mapErreurs = form.getErreurs();
		 
		if(! mapErreurs.isEmpty()) {  
			model.addAttribute("mapErreurs", mapErreurs);
			return "666";   
		}
				
		return "667";
	}
	
	
}
