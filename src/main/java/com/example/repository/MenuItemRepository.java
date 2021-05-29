package com.example.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Customer;
import com.example.domain.MenuItem;

@Repository
public interface MenuItemRepository  extends CrudRepository<MenuItem, Integer>{

	
	MenuItem findById(int id);
}
