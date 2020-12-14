package com.formation.parking.controlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.parking.models.Parking;
import com.formation.parking.services.ParkingService;





@RestController
public class ParkingController {

	@Autowired
	private ParkingService parkingService;
	
	@RequestMapping(path = "api/parkings", method = RequestMethod.GET ) // A remplacer par GetMapping (voir cour OC et projet apirh)
	public List<Parking> getListParkings() {
		
		return parkingService.getListeParkings();
	}
	
}
