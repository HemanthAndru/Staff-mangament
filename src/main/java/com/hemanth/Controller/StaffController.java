package com.hemanth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hemanth.dao.StaffDaoRepositry;
import com.hemanth.entites.staff;
import com.hemanth.exceptions.CustomerNotFoundException;

@RestController
public class StaffController {

	@Autowired
	private StaffDaoRepositry staffDaoRepositry;
	
	@PostMapping("/staff")
	public staff saveData(@RequestBody staff s) {
		return staffDaoRepositry.save(s);
		
	}
	@GetMapping("/customer/{id}")
	public staff getCustomerById(@PathVariable(value = "id") Integer id) throws CustomerNotFoundException {
		return staffDaoRepositry.findById(id).orElseThrow(() -> new CustomerNotFoundException(id));
	}
}
