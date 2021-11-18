package com.pika.pika.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pika.pika.enitites.load;
import com.pika.pika.services.loadService;

@RestController
public class Control {
	@Autowired
	public loadService ls;
	@GetMapping("/load")
	public List<load> getload(){
		return this.ls.getload();
	}
	@GetMapping("/load/{Id}")
	public load getload(@PathVariable int Id) {
		return this.ls.getload(Id);
		
	}
	@PostMapping("/load")
	public load addload(@RequestBody load load) {
		return this.ls.addload(load);
	}
	@GetMapping("/")
	public String home(){
		return "Working";
	}
	
	

}
