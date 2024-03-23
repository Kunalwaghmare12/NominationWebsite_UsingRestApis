package com.myProject.nominationWebsiteBackend.repo;

import org.springframework.data.repository.CrudRepository;

import com.myProject.nominationWebsiteBackend.entity.Nominee;

public interface NomineeRepo extends CrudRepository<Nominee,Integer> {

}
