

package com.cjc.controller;

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
import org.springframework.web.client.RestTemplate;

import com.cjc.model.Bank;

@RestController
public class ReserveController {

	@Autowired
	RestTemplate rt;
	
	@PostMapping("/ins")
	public String insertBank(@RequestBody Bank b) {
		String url="http://zuul/insert/savedata";
	rt.postForObject(url,b,String.class);
		return "saveData";
	}
	
	
	@GetMapping("/getalldata")
	public List<Bank> getdata() {
		String url="http://zuul/get/getdata";
		List<Bank> b=rt.getForObject(url, List.class);
		
		return b;
		
		
		
	}
	@GetMapping("/getbyid/{id}")
	public Bank getsindata(@PathVariable("id")int id) {
		String url="http://zuul/get/getbyid/"+id;
		Bank b=rt.getForObject(url, Bank.class);
		
		return b;
	}
	
	@DeleteMapping("/del/{id}")
	public String delData(@PathVariable("id") int id) {
		String url="http://zuul/delete/deleted/"+id;
		rt.delete(url);
	
			return "delete";
	}
	
	 @PutMapping("/updateUser/{id}")
	    public String upData(@PathVariable("id") int id, @RequestBody Bank b) {
	        String url = "http://zuul/update/updata/" + id;
	        rt.put(url, b);
	        return "update successful";
	    }
	 
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

