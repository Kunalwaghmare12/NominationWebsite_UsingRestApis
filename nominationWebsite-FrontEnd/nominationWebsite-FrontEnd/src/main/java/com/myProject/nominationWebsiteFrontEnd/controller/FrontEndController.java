package com.myProject.nominationWebsiteFrontEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.myProject.nominationWebsiteFrontEnd.entity.Nominee;

@Controller
public class FrontEndController {
	
	@Autowired
	RestTemplate restTemplate;
	
	private static final String BASE_URL ="http://localhost:8090/";
	
	@GetMapping("/home")
	public String getHomePage() {
		return "Home";
	}
	
	@GetMapping("/form")
	public String showForm() {
		return "nominee-form";
	}
	
	@PostMapping("/form")
	public String getDetails(@ModelAttribute Nominee nominee) {
		String url = BASE_URL + "/Backend-form";
		ResponseEntity<Nominee> response = restTemplate.postForEntity(url, nominee, Nominee.class);
		response.getBody();
		return "redirect:/form";
	}
	
	@GetMapping("/list")
	public String showList(Model model) {
		ResponseEntity<List<Nominee>> response = restTemplate.exchange(
	            BASE_URL + "/Backend-list",
	            HttpMethod.GET,
	            null,
	            new ParameterizedTypeReference<List<Nominee>>() {});
		List<Nominee> nomineeList = response.getBody();
		model.addAttribute("nomineeList", nomineeList);
		return "showList";
	}
	
	

}
