package com.yaz.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yaz.entity.HesapHareketi;
import com.yaz.ows.HesapHareketleriService;

@RestController
@RequestMapping("/api")
public class HesapHareketiRestController {
	@Autowired
	private HesapHareketleriService hesapHareketleriService;
	
	
//-----------------------------------HESAP HAREKET�----------------------------------

	@RequestMapping(value="/hesapHareketleri", method = RequestMethod.GET)
	public List<HesapHareketi> getHesapHareketleri(){
		return hesapHareketleriService.getHesapHareketleri();
	}
	
	@PostMapping("/hesapHareketleri")
	public HesapHareketi addHesapHareketi(@RequestBody HesapHareketi hesapHareketi){
		
		hesapHareketi.setId(0);
		
		hesapHareketleriService.saveHesapHareketi(hesapHareketi);
		
		return hesapHareketi;
	}
	
	@PutMapping("/hesapHareketleri")
	public HesapHareketi updateHesapHareketi(@RequestBody HesapHareketi hesapHareketi){
		
		hesapHareketleriService.saveHesapHareketi(hesapHareketi);
		
		return hesapHareketi;
	}
	
	@DeleteMapping("/hesapHareketleri/{hesapHareketiId}")
	public String deleteHesapHareketi(@PathVariable int hesapHareketiId){
		
		HesapHareketi hesapHareketi = hesapHareketleriService.getHesapHareketi(hesapHareketiId);
		
		if(hesapHareketi == null)
			throw new CustomerNotFoundException("HesapHareketi id not found - " + hesapHareketiId);
		
		hesapHareketleriService.deleteHesapHareketi(hesapHareketiId);
		
		return "Deleted HesapHareketi id - " + hesapHareketiId;
	}
}
