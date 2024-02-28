package net.javaguides.springboot.adminController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.adminModel.adminModel;
import net.javaguides.springboot.adminRepository.adminRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins="http://localhost:4200")
public class adminController {

	@Autowired
	private adminRepository repo;

	
	//get all 
	
	@GetMapping("/admin")
	public List <adminModel> getAllAdmins(){
		return repo.findAll();
	}
}
