package com.hrr3.authentication;

import java.io.Serializable;
import java.util.ArrayList;

import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;

import com.hrr3.entity.Customer;
import com.hrr3.entity.Hotel;
import com.hrr3.entity.ProductType;
import com.hrr3.entity.User;
import com.hrr3.services.AuthenticationService;

public class AuthenticationServiceBasiccImpl implements AuthenticationService,Serializable{
	private static final long serialVersionUID = 1L;

	public User getUserData(){
		Session sess = Sessions.getCurrent();
		System.out.println("Session is - "+sess);
		User user = (User)sess.getAttribute("userData");
		System.out.println("User  is - "+user);
		
		return user;
	}
	

	public User doAuthentication(String nm, String pd) {
		// will be implemented in chapter 8
		return null;
	}
	
	public ArrayList<Customer> findValidCustomers (Integer userId) {
		
		return null;
	}
	
	public ArrayList<ProductType> findValidProducts (Integer userId) {
		
		return null;
	}
	
	public ArrayList<Customer> getAllCustomers () {
		
		return null;
	}
	
	public ArrayList<Hotel>getUserHotels (Integer userId, Integer customerId) {
		
		return null;
	}
	
	public ArrayList<Hotel> getCustomerHotels(Integer customerId) {
		
		return null;
	}


	public void logout() {
		// will be implemented in chapter 8
	}


	@Override
	public void setUserData(User user) {
		// TODO Auto-generated method stub
		Session sess = Sessions.getCurrent();
		sess.setAttribute("userData",user);
		
	}
}
