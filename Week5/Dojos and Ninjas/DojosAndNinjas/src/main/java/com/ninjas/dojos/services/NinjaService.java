package com.ninjas.dojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninjas.dojos.models.Ninja;
import com.ninjas.dojos.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepo;
	
	//Get all ninjas
	public List<Ninja> getAll(){
	return ninjaRepo.findAll();
	}
	//create new ninja
	public Ninja create(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
}
