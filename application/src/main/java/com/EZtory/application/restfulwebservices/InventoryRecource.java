package com.EZtory.application.restfulwebservices;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class InventoryRecource {
	
	@Autowired
	private InventoryHardcodedServices inventoryService;
	
	@GetMapping("/users/{username}/inventory")
	public List<Inventory> getAllInventory(@PathVariable String username){
		return inventoryService.findAll();
		
	}
	
	@GetMapping("/users/{username}/inventory/{id}")
	public Inventory getInventory(@PathVariable String username,@PathVariable long id){
		return inventoryService.findById(id);
		
	}
	
	//delete
	@DeleteMapping("/users/{username}/inventory/{id}")
	public ResponseEntity<Void> deleteInventory(
			@PathVariable String username, @PathVariable long id){
		
		Inventory inventoryX=inventoryService.deleteById(id);
		if(inventoryX!=null) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.notFound().build();
	}
	
	//update
	@PutMapping("/users/{username}/inventory/{id}")
	public ResponseEntity<Inventory> updateInventory(
			@PathVariable String username, @PathVariable long id, @RequestBody Inventory inventoryX){
		Inventory inventoryUpdate= inventoryService.save(inventoryX);
				return new ResponseEntity<Inventory>(inventoryX,HttpStatus.OK);
	
	}
	
	@PostMapping("/users/{username}/inventory")
	public ResponseEntity<Void> updateInventory(
			@PathVariable String username, @RequestBody Inventory inventoryX){
		Inventory createInventory= inventoryService.save(inventoryX);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createInventory.getId()).toUri();
				return ResponseEntity.created(uri).build();
	
	}
}
