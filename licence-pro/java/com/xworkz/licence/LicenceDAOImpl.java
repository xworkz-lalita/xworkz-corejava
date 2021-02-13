package com.xworkz.licence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.constants.VehicleType;
import com.xworkz.dto.LicenceDTO;

public class LicenceDAOImpl implements LicenceDAO {

	private List<LicenceDTO> database = new ArrayList<LicenceDTO>();

	/*
	 * private List<LicenceDTO> database;
	 * 
	 * public LicenceDAOImpl() { this.database = new ArrayList<LicenceDTO>(); }
	 */
	@Override
	public void save(LicenceDTO dto) {
		System.out.println("invoked save in licence dao");
		System.out.println("dto to save" + dto);
		boolean saved = this.database.add(dto);
		if (saved)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");

	}

	@Override
	public LicenceDTO findByIdProof(String idProofNO) {
		System.out.println("invoked by findbyidproof");
		System.out.println("idProofNO" + idProofNO);
		for (LicenceDTO licenceDTO : this.database) {
			if (licenceDTO.getIdProofNumber().equals(idProofNO)) {
				System.out.println("licence is found");
				return licenceDTO;
			}
		}
		return null;

	}

	@Override
	public boolean updateVehicleByIDProofNumber(String idProofNo, VehicleType type) {
		System.out.println("invoked by idproofnumber");
		System.out.println("idProofNo" + idProofNo);
		System.out.println("type" + type);
		LicenceDTO fromDB = this.findByIdProof(idProofNo);
		if (fromDB != null) {
			System.out.println("can update,licence found");
			fromDB.setType(type);
			System.out.println("licenceDTO");
			System.out.println(fromDB);
			return true;
		} else {
			System.out.println("cannot update");
		}

		return false;
	}

	@Override
	public boolean deleteByidProofNo(String idProofNo) {
		System.out.println("invoked by idProofNo");
		System.out.println("idProofNo" + idProofNo);
		Iterator<LicenceDTO> iterator = database.iterator();
		while (iterator.hasNext()) {
			LicenceDTO dto = iterator.next();
			if (dto.getIdProofNumber().equals(idProofNo)) {
				System.out.println("delete the elemnent");
				iterator.remove();
				return true;
			}
		}
		return false;
	}
}