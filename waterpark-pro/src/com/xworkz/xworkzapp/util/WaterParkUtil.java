package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.park.WorkersDTO;
import com.xworkz.xworkzapp.waterpark.WaterPark;

public class WaterParkUtil {
	public static void main(String[] args) {
	WaterPark waterPark=new WaterPark();
	waterPark.addManager("lalita b k",12112222222222222l);
	waterPark.displayManagers();
	WorkersDTO dto=new WorkersDTO();
	dto.setName("Ranga");
	dto.setWorkerId(12222);
	WorkersDTO dt=new WorkersDTO();
	dt.setName("vittala");
	dt.setWorkerId(11111);
	waterPark.workersDTOs=new WorkersDTO[2];
waterPark.addWorkers(dto);
waterPark.addWorkers(dt);
WorkersDTO workersDTO=waterPark.showWorkersByName("ganagadhar");
System.out.println(workersDTO.getName()+" "+workersDTO.getWorkerId());

	}

}
