package com.bank.account;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class AccountController {
	@Autowired
	private IAccountService service;
		
	@GetMapping("/list")
	public List<Account> listar(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Account> buscarPorId(String id){
		return service.findById(id);
	} 
}
