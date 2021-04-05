package com.wolken.wolkenapp.Service;

import java.util.List;

import com.wolken.wolkenapp.DAO.BiscuitsDAO;
import com.wolken.wolkenapp.DAO.BiscuitsDAOImpl;
import com.wolken.wolkenapp.DTO.BiscuitsDTO;

public class BiscuitsServiceImpl implements BiscuitsService  {

	@Override
	public boolean validateAndSave(BiscuitsDTO biscuitsDTO) {
		// TODO Auto-generated method stub
		boolean check=false;
		if(biscuitsDTO!=null) {
			String brand=biscuitsDTO.getBrand();
			if(brand!=null &&!brand.isEmpty() && !brand.contains(" ")) {
				check=true;
				System.out.println("brand is valid");
				}
			if(check) {
			 int quantity=biscuitsDTO.getQuantity();
			 if(quantity>0) {
				 check=true;
				 System.out.println("quantity is valid");
			 }
			}
			if(check) {
				int price=biscuitsDTO.getPrice();
				if(price>0 && price<100) {
					check=true;
					System.out.println("Price is valid");
					BiscuitsDAO biscuitsDAO=new BiscuitsDAOImpl();
					biscuitsDAO.save(biscuitsDTO);
				}
			}
		
		}
	return check;
	}

}
