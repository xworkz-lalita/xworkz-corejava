package com.xworkz.licence;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import com.xworkz.constants.BooldGroup;
import com.xworkz.constants.Gender;
import com.xworkz.constants.IdProof;
import com.xworkz.constants.VehicleType;
import com.xworkz.dto.AddressDTO;
import com.xworkz.dto.LicenceDTO;

public class LicenceTester {
	public static void main(String[] args) {

		AddressDTO address = new AddressDTO(1221, 583104, "NA", "Vidya Nagar", "Lakshmi bIlding", "Karnataka", "India");
		System.out.println(address);

		Calendar date1 = new GregorianCalendar();
		Calendar date2 = (Calendar) date1.clone();
		date2.add(Calendar.DATE, -8500);

		LicenceDTO dto1 = new LicenceDTO("Soubhagya", 23, address, 7899359294l, BooldGroup.Bombay_BloodGroup,
				Gender.Female, new SimpleDateFormat("dd-MM-yyyy").format(date2.getTime()));

		dto1.setIdProof(IdProof.AdharCard);
		dto1.setIdProofNumber("985512120099");
		dto1.setType(VehicleType.Two_Wheeler);
		dto1.setCommercial(true);
		dto1.setDisability(false);
		Calendar date3 = new GregorianCalendar();
		Calendar date4 = (Calendar) date1.clone();
		date4.add(Calendar.DATE, +98);
		dto1.setStartDate(new SimpleDateFormat("dd-MM-yyyy").format(date4.getTime()));
		System.out.println(dto1.getIdProofNumber() + " " + dto1.getIdProof() + " " + dto1.getType() + " "
				+ dto1.getStartDate() + " " + dto1.isCommercial() + " " + dto1.isDisability());

		LicenceDAO dao = new LicenceDAOImpl();
		dao.save(dto1);
		
		LicenceDTO dto=dao.findByIdProof("985512120099");
		System.out.println(dto);
		boolean dt=dao.updateVehicleByIDProofNumber("985512120099", VehicleType.LMV);
		System.out.println(dt);
        boolean dd=dao.deleteByidProofNo("985512120099");
        System.out.println(dd);
	}
}
