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
	//update
	public void updateExpense(Travel travel) {
		travelsRepo.save(travel);
	}
	// delete
	public void deleteExpense(Long id) {
		travelsRepo.deleteById(id);
	}
	// get expense details
	public Travel expenseDetails(Long id) {
		return travelsRepo.findById(id).orElse(null);
	}
	
}
