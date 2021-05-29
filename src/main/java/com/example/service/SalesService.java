package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.domain.Basket;
import com.example.domain.Customer;
import com.example.domain.Sales;
import com.example.repository.BasketRepository;
import com.example.repository.CustomerRepository;
import com.example.repository.DiscountRepository;
import com.example.repository.MenuItemRepository;
import com.example.repository.MenuRepository;
import com.example.repository.RestaurantRepository;
import com.example.repository.SalesRepository;

public class SalesService {

	@Autowired
	public RestaurantRepository restaurantRepository;
	@Autowired
	public MenuRepository menuRepository;
	@Autowired
	public MenuItemRepository itemRepository;
	@Autowired
	public BasketRepository basketRepository;
	@Autowired
	public CustomerRepository customerRepository;
	@Autowired
	public DiscountRepository discountRepository;
	@Autowired
	public SalesRepository salesRepository;
	
	public Basket orderedBasket (Basket basket, int orderId) {
		
    	if(basket.getOrderId()== orderId) {
    		return basket;
    	
    	}
		
		return null;
	
		
	}

	
	
	
}
