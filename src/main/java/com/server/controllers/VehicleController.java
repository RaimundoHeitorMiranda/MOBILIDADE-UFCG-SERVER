package com.server.controllers;

import java.util.List;

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

import com.server.entities.Vehicle;
import com.server.response.Response;
import com.server.services.VehicleService;

@RestController
@RequestMapping("/vehicle")
@CrossOrigin(origins = "*")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping
	public ResponseEntity<Response<Vehicle>> registerVehicle(@RequestBody Vehicle vehicle){
		
		// Response Object.
		Response<Vehicle> response =  new Response<Vehicle>();
		
		// Save vehicle in the database.
		this.vehicleService.save(vehicle);
		
		
		return ResponseEntity.ok(response);
	}
	
	@GetMapping
	public ResponseEntity<Response<Vehicle>> getAllVehicle(){
		
		// Response Object.
		Response<Vehicle> response =  new Response<Vehicle>();
		
		List<Vehicle> vehicle = this.vehicleService.findAll();
		
		response.setData(vehicle);
		
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Response<Vehicle>> getVehicle(@PathVariable Long id){
		
		// Response Object.
		Response<Vehicle> response =  new Response<Vehicle>();
		
		Vehicle vehicle = this.vehicleService.findById(id);
		
		response.setData(vehicle);
		
		return ResponseEntity.ok(response);
	}
	
	@PutMapping(value = "{id}")
	public ResponseEntity<Response<Vehicle>> updateVehicle(@PathVariable Long id,@RequestBody Vehicle vehicle){
		
		vehicle.setId(id);
		
		this.vehicleService.save(vehicle);
		
		// Response Object.
		Response<Vehicle> response =  new Response<Vehicle>();
		
		
		return ResponseEntity.ok(response);
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<Response<Vehicle>> deleteVehicle(@PathVariable Long id){
		
		this.vehicleService.delete(id);
		
		// Response Object.
		Response<Vehicle> response =  new Response<Vehicle>();
		
		
		return ResponseEntity.ok(response);
	}
	
}