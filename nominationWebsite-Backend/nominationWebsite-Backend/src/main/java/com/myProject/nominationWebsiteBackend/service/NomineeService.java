package com.myProject.nominationWebsiteBackend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.nominationWebsiteBackend.entity.Nominee;
import com.myProject.nominationWebsiteBackend.repo.NomineeRepo;

@Service
public class NomineeService {
	
	@Autowired
	NomineeRepo repo;
	
	//save Nominee
	public Nominee saveNominee(Nominee n) {
		return repo.save(n);
	}
	
	public Iterable<Nominee> getList(){
		
		return repo.findAll();
	}
	
	public Nominee deleteNominee(Nominee n) {
		repo.delete(n);
		return n;
	}

	
}
