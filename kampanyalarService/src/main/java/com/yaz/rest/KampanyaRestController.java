package com.yaz.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yaz.entity.Kampanya;
import com.yaz.ows.KampanyaService;

@RestController
@RequestMapping("/api")
public class KampanyaRestController {
	@Autowired
	private KampanyaService kampanyaService;
	
//-----------------------------------KAMPANYALAR----------------------------------
	
	@GetMapping("/kampanyalar")
	public List<Kampanya> getKampanyalar(){
		return kampanyaService.getKampanyalar();
	}
	
	@PostMapping("/kampanyalar")
	public Kampanya addKampanya(@RequestBody Kampanya kampanya){
		
		kampanya.setId(0);
		
		kampanyaService.saveKampanya(kampanya);
		
		return kampanya;
	}
	
	@PutMapping("/kampanyalar")
	public Kampanya updateKampanya(@RequestBody Kampanya kampanya){
		
		kampanyaService.saveKampanya(kampanya);
		
		return kampanya;
	}
	
	@DeleteMapping("/kampanyalar/{kampanyaId}")
	public String deleteKampanya(@PathVariable int kampanyaId){
		
		Kampanya kampanya = kampanyaService.getKampanya(kampanyaId);
		
		if(kampanya == null)
			throw new CustomerNotFoundException("Kampanya id not found - " + kampanyaId);
		
		kampanyaService.deleteKampanya(kampanyaId);
		
		return "Deleted Kampanya id - " + kampanyaId;
	}
}
