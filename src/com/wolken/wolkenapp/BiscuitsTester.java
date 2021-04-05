package com.wolken.wolkenapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wolken.wolkenapp.DAO.BiscuitsDAO;
import com.wolken.wolkenapp.DAO.BiscuitsDAOImpl;
import com.wolken.wolkenapp.DTO.BiscuitsDTO;
import com.wolken.wolkenapp.Service.BiscuitsService;
import com.wolken.wolkenapp.Service.BiscuitsServiceImpl;

public class BiscuitsTester {
	public static void main(String[] args) {
		List<BiscuitsDTO> biscuitsDTOs = new ArrayList<>();
		BiscuitsDTO biscuitsDTO = new BiscuitsDTO();
		biscuitsDTO.setId(3);
		biscuitsDTO.setPrice(12);
		biscuitsDTO.setName("hide&seek");
		biscuitsDTO.setBrand("Parle");
		biscuitsDTO.setQuantity(500);
		BiscuitsDTO biscuitsDTO1 = new BiscuitsDTO();
		biscuitsDTO1.setId(2);
		biscuitsDTO1.setPrice(10);
		biscuitsDTO1.setName("Bounce");
		biscuitsDTO1.setBrand("Sunfeast");
		biscuitsDTO1.setQuantity(500);
		BiscuitsDTO biscuitsDTO2 = new BiscuitsDTO();
		biscuitsDTO2.setId(1);
		biscuitsDTO2.setPrice(15);
		biscuitsDTO2.setName("Magix");
		biscuitsDTO2.setBrand("Parle");
		biscuitsDTO2.setQuantity(500);
		biscuitsDTOs.add(biscuitsDTO);
		biscuitsDTOs.add(biscuitsDTO1);
		biscuitsDTOs.add(biscuitsDTO2);
		System.out.println(biscuitsDTOs);

		Map<Integer, BiscuitsDTO> BiscuitsDTOs = new HashMap<Integer, BiscuitsDTO>();
		BiscuitsDTOs.put(1, biscuitsDTO);
		BiscuitsDTOs.put(2, biscuitsDTO1);
		BiscuitsDTOs.put(3, biscuitsDTO2);
		System.out.println(BiscuitsDTOs.get(1));
		System.out.println(BiscuitsDTOs.get(2));
		for (Map.Entry<Integer, BiscuitsDTO> list : BiscuitsDTOs.entrySet()) {
			System.out.println(list);
		}

		/*
		 * List<BiscuitsDTO>biscuitsDTOs=new ArrayList<BiscuitsDTO>();
		 * biscuitsDTOs.add(biscuitsDTO); biscuitsDTOs.add(biscuitsDTO1);
		 * biscuitsDTOs.add(biscuitsDTO2); biscuitsDTOs.forEach(System.out::println);
		 * Collections.sort(biscuitsDTOs); System.out.println("---------------");
		 * biscuitsDTOs.forEach(System.out::println); Collections.sort(biscuitsDTOs,new
		 * BrandComparator() ); System.out.println("------------------");
		 * biscuitsDTOs.forEach(System.out::println);
		 */
		BiscuitsDAO biscuitsDAO = new BiscuitsDAOImpl(biscuitsDTOs);
		BiscuitsService biscuitsService = new BiscuitsServiceImpl();
		biscuitsDAO.updateBrandandQuantityByPrice("Parle", 500, 15);
		biscuitsDAO.updateNameByBrand("Parle", "5050");
		biscuitsDAO.updatePriceByBrandandName("Sunfeast", "Bounce", 5);
		System.out.println(biscuitsDTOs);
		biscuitsDAO.deleteByBrandName("Sunfeast");
		biscuitsDAO.deleteAll();

	}

}
