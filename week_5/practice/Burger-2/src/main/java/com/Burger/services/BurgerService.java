package com.Burger.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Burger.Repositories.BurgerRepo;
import com.Burger.models.Burger;

@Service
public class BurgerService {
	
	@Autowired
	BurgerRepo burgerRepo;
	
	public List<Burger> allBurgers(){
		return burgerRepo.findAll();
	}
	
	public Burger createBurger(Burger burger) {
		return burgerRepo.save(burger);
	}
	
	public Burger updateBurger(Long id,Burger newBurger) {
		newBurger.setId(id);
		return burgerRepo.save(newBurger);
	}
	
	public Burger getBurger(Long id) {
		Optional<Burger> burger=burgerRepo.findById(id);
		if(burger.isEmpty()) {
			return null;
		}else {
			return burger.get();
		}
	}
	
}
