package com.bank.account;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {

	@Autowired
	private AccountRepository repository;
	
	@Override
	public List<Account> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Account> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Account save(Account account) {
		return repository.save(account);
	}

	@Override
	public void delete(Account account) {
		repository.delete(account);
		
	}

}
