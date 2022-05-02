package com.travels.safe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.travels.safe.models.Travel;
import com.travels.safe.repositories.TravelsRepository;

@Service
public class TravelService {
	
	@Autowired
	private TravelsRepository travelsRepo;
	
	// find all
	public List<Travel> getAll(){
		return travelsRepo.findAll();
	}
	// create new
	public void createExpense(Travel travel) {
		travelsRepo.save(travel);
	}
	
}
