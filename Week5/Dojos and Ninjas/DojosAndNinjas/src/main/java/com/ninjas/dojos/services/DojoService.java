package com.ninjas.dojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninjas.dojos.models.Dojo;
import com.ninjas.dojos.repositories.DojoRepository;

@Service
public class DojoService {

	@Autowired
	private DojoRepository dojoRepo;
	
	//Get all dojos
	public List<Dojo> getAll(){
		return dojoRepo.findAll();
		}
	//create new dojo
	public Dojo create(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	//find one dojo by id
	public Dojo findOne(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}
}
