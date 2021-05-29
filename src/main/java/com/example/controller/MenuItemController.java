package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Menu;
import com.example.domain.MenuItem;
import com.example.domain.Restaurant;
import com.example.service.MenuItemService;
import com.example.service.MenuService;
import com.example.service.RestaurantService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/menuitem")
public class MenuItemController {
	
	@Autowired
	MenuItemService menuItemService;
	
	
	
	 @PostMapping("/additem")
	    public String add(@RequestBody MenuItem menuitem) {
			return menuItemService.addMenuItem(menuitem);
	        
	    }
	 
	
	
	 @GetMapping("/getMenuItem")
	    public List<MenuItem> getMenuItem() {
		 return menuItemService.getMenuItem();
		
	    }

}
