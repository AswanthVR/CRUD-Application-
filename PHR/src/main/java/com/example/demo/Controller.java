package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	Interface f1;
	
	@GetMapping("/get")
	public List<patient_info> getDetails()
	{
		System.out.println("Retrieved All the Patient Details Present In The Table");
		return f1.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id") int id)
	{
		f1.deleteById(id);
		return "Id : "+id+" is successfully deleted";
	}
	
	@PostMapping("/post")
	public String postDetails(@RequestBody patient_info p1)
	{
		f1.save(p1);
		return "Patient Details Successfully Saved In The DataBase";
	}
	
	@PutMapping("/put/{id}")
	public patient_info update_patientDetails(@RequestBody patient_info p)
	{
		System.out.println("The Changes Made Have Been Successfully Updated");
		return f1.save(p);
		
	}
}
