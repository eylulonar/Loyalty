package com.example.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Sales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int salesId;
	private String orderDate;
	private float invoice;
	

	
	@ManyToOne
	@JsonBackReference(value="sales-cust")
	private Customer customer;



	public int getSalesId() {
		return salesId;
	}


	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}


	public float getInvoice() {
		return invoice;
	}


	public void setInvoice(float invoice) {
		this.invoice = invoice;
	}


	public Sales(int salesId, String orderDate, float invoice, Customer customer) {
		super();
		this.salesId = salesId;
		this.orderDate = orderDate;
		this.invoice = invoice;
		
		this.customer=customer;
	}
	
	

	public Sales() {
		
	}
}
