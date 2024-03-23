package com.myProject.nominationWebsiteBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myProject.nominationWebsiteBackend.entity.Nominee;
import com.myProject.nominationWebsiteBackend.service.NomineeService;

@RestController
@CrossOrigin("*")
public class BackEndController {
	
	@Autowired 
	NomineeService service;
	
	@PostMapping("/Backend-form")
	public ResponseEntity<Nominee> saveForm(@RequestBody Nominee n){
		Nominee savedNominee=service.saveNominee(n);
		return ResponseEntity.ok(savedNominee);
	}
	
	@GetMapping("/Backend-list")
	public ResponseEntity<List<Nominee>> getList(){
		List<Nominee> nominee=(List<Nominee>) service.getList();
		return new ResponseEntity<>(nominee,HttpStatus.OK);
	}
	
	@DeleteMapping("/Backend-del")
	public ResponseEntity<String> delEntry(@RequestBody Nominee n){
		Nominee delNominee=service.deleteNominee(n);
		return ResponseEntity.ok("Nominee Deleted Sucesfully");
	}
	
	

}
