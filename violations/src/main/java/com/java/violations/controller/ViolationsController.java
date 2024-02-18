package com.java.violations.controller;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.violations.model.Violations;
import com.java.violations.repository.ViolationsRepository;

@CrossOrigin(origins="*")
@RestController()
@RequestMapping("/api/v1")
public class ViolationsController {
@Autowired
private  ViolationsRepository violsRepository;
@GetMapping("/violations")
public List<Violations> getViolations(){
	
	return violsRepository.findAll();
}
@PostMapping("/violations")
public Violations createViolations(@RequestBody Violations violations) {
	violations.setAmount(violations.getAmount());
	return violsRepository.save(violations);
	}
@GetMapping("/violations/{id}")
public ResponseEntity<Violations> getViolationsById(@PathVariable Long id){
	Violations violations=violsRepository.findById(id).orElseThrow();
	return ResponseEntity.ok(violations);
	
}
@PutMapping("/violations/{id}")
public ResponseEntity<Violations> updateViolations(@PathVariable Long id,@RequestBody Violations violationsDetails ){
	Violations violations=violsRepository.findById(id).orElseThrow();
	violations.setVno(violationsDetails.getVno());
	violations.setVcat(violationsDetails.getVcat());
	violations.setAmount(violationsDetails.getAmount());
	violations.setVdate(violationsDetails.getVdate());
	violations.setLocation(violationsDetails.getLocation());
	Violations updatedViolation=violsRepository.save(violations);
	return ResponseEntity.ok(updatedViolation);
   
}
@DeleteMapping("/violations/{id}")
public ResponseEntity<Map<String,Boolean>> deleteViolations(@PathVariable Long id){
	Violations violations=violsRepository.findById(id).orElseThrow();
	violsRepository.delete(violations);
	Map<String,Boolean>response=new HashMap<>();
	response.put("deleted", true);
	return ResponseEntity.ok(response);
			
	
}
}
