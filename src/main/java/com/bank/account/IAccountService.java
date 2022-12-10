package com.bank.account;

import java.util.List;
import java.util.Optional;

public interface IAccountService {
	public List<Account> findAll();
	public Optional<Account> findById(String id);
	public Account save(Account account);
	public void delete(Account account);
}
