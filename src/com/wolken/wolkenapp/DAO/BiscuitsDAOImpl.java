package com.wolken.wolkenapp.DAO;

import java.util.List;

import com.wolken.wolkenapp.DTO.BiscuitsDTO;

public class BiscuitsDAOImpl implements BiscuitsDAO {
	List<BiscuitsDTO> obj;
	
	public BiscuitsDAOImpl() {
		
	}

	public BiscuitsDAOImpl(List<BiscuitsDTO> obj) {
		this.obj =obj;
	}

	@Override
	public void save(BiscuitsDTO biscuitsDTO) {
		// TODO Auto-generated method stub
		boolean check = obj.contains(biscuitsDTO);

	}

	@Override
	public void updatePriceByBrandandName(String brandName, String Name, int price) {
		// TODO Auto-generated method stub
		for (BiscuitsDTO biscuitsDTO : obj) {
			if (biscuitsDTO.getBrand().equalsIgnoreCase(brandName)) {
				if (biscuitsDTO.getName().equalsIgnoreCase(Name)) {
					biscuitsDTO.setPrice(price);
					System.out.println("updated price by brandname & name");
					break;
				}

			} else {
				//System.out.println("value of brand name and name is not proper");
			}
		}

	}

	@Override
	public void updateBrandandQuantityByPrice(String brandName, int quantity, int price) {
		// TODO Auto-generated method stub
		for (BiscuitsDTO biscuitsDTO : obj) {
			if (biscuitsDTO.getPrice() == price) {
				biscuitsDTO.setBrand(brandName);
				biscuitsDTO.setQuantity(quantity);
				System.out.println("updated brand &quantity by price");
				break;
			}

			else {
				//System.out.println("value of price is not proper");
			}
		}
	}

	@Override
	public void updateNameByBrand(String brandName, String name) {
		// TODO Auto-generated method stub
		for (BiscuitsDTO biscuitsDTO : obj) {
			if (biscuitsDTO.getBrand().equals(brandName)) {
				biscuitsDTO.setName(name);
				System.out.println(biscuitsDTO);
				System.out.println("updated Name by brand");
				break;
			}

			else {
				System.out.println("value of brand is not proper");
			}
		}
	}
	

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		for (BiscuitsDTO biscuitsDTO : obj) {
			biscuitsDTO=null;
			System.out.println(biscuitsDTO);

		}
	}

	@Override
	public void deleteByBrandName(String BrandName) {
		// TODO Auto-generated method stub
		for (BiscuitsDTO biscuitsDTO : obj) {
			if(biscuitsDTO.getBrand().equals(BrandName)) {
				System.out.println(biscuitsDTO);
				biscuitsDTO=null;
				System.out.println("deleted successfully by brand name");
			}
		}
	}

}
