
import java.util.Collections;

import com.xworkz.restaurent.dao.Finder;
import com.xworkz.restaurent.dao.FinderImpl;
import com.xworkz.restaurent.dao.RestaurentService;
import com.xworkz.restaurent.dao.RestaurentServiceImpl;
import com.xworkz.restaurent.dto.MenuDTO;
import com.xworkz.restaurent.dto.MenuDTO.Type;

public class TesterLalita {
	public static void main(String[] args) {
		RestaurentService service=new RestaurentServiceImpl();
		service.displayItemGreaterThan(200.00);
		service.displayName("Sushi");
		service.displayType(Type.NONVEG);
		
		Finder finder=new FinderImpl(); 
	
		//for finding the veg  if we want to find nonveg then we have
//to create again nonvegfinder class 

		
		//functional interface
		service.findAndDisplay(new Finder() {
			
			@Override
			public boolean test(MenuDTO dto) {
				if(dto.getType().equals(Type.VEG)&&dto.getPrice()>100) {
					return true;
					}
				return false;
			}
		});
		
		
		//lambada 
		service.findAndDisplay(t->t.getPrice()>100 );
		//Collections.sort(list);
	}

}
