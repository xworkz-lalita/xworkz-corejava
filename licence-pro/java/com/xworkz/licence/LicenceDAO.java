package com.xworkz.licence;

import com.xworkz.constants.VehicleType;
import com.xworkz.dto.LicenceDTO;

public interface LicenceDAO {

	public void save(LicenceDTO dto);
  LicenceDTO findByIdProof(String idProofNo);
  boolean updateVehicleByIDProofNumber(String idProofNo, VehicleType type);
  boolean deleteByidProofNo(String idProofNo);

}
