package tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.magzines.dao.MagzineDAO;
import com.xworkz.magzines.dao.MagzinesDAOImpl;
import com.xworkz.magzines.dto.MagzineDTO;
import com.xworkz.magzines.service.MagzinesService;
import com.xworkz.magzines.service.MagzinesServiceImpl;

public class SerTester {
	public static void main(String[] args) {
		List<MagzineDTO> list=new ArrayList<MagzineDTO>();
		MagzineDAO dao=new MagzinesDAOImpl(list);
		MagzineDTO dto1=new MagzineDTO("Times",50.00,50);
		dao.save(dto1);
		MagzineDTO dto2=new MagzineDTO("Tunturu",6.00,20);
		dao.save(dto2);
		
		list.add(dto1);
		list.add(dto2);
		
		
		MagzinesService service=new MagzinesServiceImpl(dao);
		service.validateAndSave(dto1);
		
		
		
	}

}
