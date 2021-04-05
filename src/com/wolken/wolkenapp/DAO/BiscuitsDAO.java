package com.wolken.wolkenapp.DAO;

import com.wolken.wolkenapp.DTO.BiscuitsDTO;

public interface  BiscuitsDAO {
	public void save(BiscuitsDTO biscuitsDTO);
	public void updatePriceByBrandandName(String brandName,String Name,int price);
	public void updateBrandandQuantityByPrice(String brandName,int quantity,int price);
	public void updateNameByBrand(String BrandName,String Name);
	public void deleteByBrandName(String BrandName);
	public void deleteAll();
}
