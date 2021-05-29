package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Menu;
import com.example.domain.MenuItem;
import com.example.domain.Restaurant;
import com.example.repository.MenuItemRepository;
import com.example.repository.MenuRepository;


@Service
public class MenuItemService {

	@Autowired
	public MenuItemRepository itemRepository;
	
	public List<MenuItem> getMenuItem(){
	 List<MenuItem> menuitems = new ArrayList<>();
		itemRepository.findAll().forEach(menuitems :: add);
		return menuitems;

	}
	
	
	
	public String addMenuItem(MenuItem menuitem) {
	itemRepository.save(menuitem);
    return "Hi " + menuitem.getItemName() + " restaurant menu item is successfully added.";
	
	}



}
