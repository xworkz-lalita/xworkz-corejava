package tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.magzines.dao.MagzineDAO;
import com.xworkz.magzines.dao.MagzinesDAOImpl;
import com.xworkz.magzines.dto.MagzineDTO;
import com.xworkz.magzines.service.MagzinesService;
import com.xworkz.magzines.service.MagzinesServiceImpl;

public class ServiceTester {
	public static void main(String[] args) {
		List<MagzineDTO> list=new ArrayList<MagzineDTO>();
		MagzineDAO dao=new MagzinesDAOImpl(list);
		
		MagzineDTO dto1=new MagzineDTO("Times",50.00,50);
		dao.save(dto1);
		MagzineDTO dto2=new MagzineDTO("Tunturu",6.00,20);
		dao.save(dto2);
		MagzineDTO dto3=new MagzineDTO("Sudha",70.00,45);
		dao.save(dto3);
		MagzineDTO dto4=new MagzineDTO("Balveer",20.00,12);
		dao.save(dto4);
		MagzineDTO dto5=new MagzineDTO("Balveer",20.00,12);
		dao.save(dto5);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		
		boolean price=dao.updatePriceByName("Sudha", 60.00);
		System.out.println(price);
		boolean find= dao.findByName("Tunturu");
		System.out.println(find);
		System.out.println(dao.getAll());
	
		
		
		
		
	
		
	
		
		
		
	}

}
