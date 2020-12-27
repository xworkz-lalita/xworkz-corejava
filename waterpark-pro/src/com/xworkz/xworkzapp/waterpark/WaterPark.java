package com.xworkz.xworkzapp.waterpark;

import com.xworkz.xworkzapp.park.ManagerDTO;
import com.xworkz.xworkzapp.park.WaterParkDTO;
import com.xworkz.xworkzapp.park.WorkersDTO;

public class WaterPark {
	public ManagerDTO manager;
	
	public WorkersDTO[] workersDTOs;
	public int index;
	
	
	public void addManager(String name,long contactNo){
		System.out.println("adding manger name and contact number");
		if(name!=null&&contactNo!=0)//validating
		this.manager=new ManagerDTO(name,contactNo);
		System.out.println("added manger details");
	}
	
	public void addManager(ManagerDTO dto) {
		System.out.println("adding manager directly");
		if(dto!=null)
			this.manager=dto;
		else
		{System.out.println("manager not added:dto");
			
		}
	}
	public void addWorkers(WorkersDTO workersDTO) {
		System.out.println("");
		if(workersDTO !=null) {
			workersDTOs[index++]=workersDTO;
		}
	}
	public void removeManager() {
		this.manager=null;
	
	}
public WorkersDTO showWorkersByName(String name) {//workerDTO is dummy 
	WorkersDTO dto=null;
	for (int i = 0; i < workersDTOs.length; i++) {
		if(workersDTOs!=null)
		{
			if(workersDTOs[i].getName().equals(name)) {// checking worker by namae
				dto=workersDTOs[i];
				
			}
		}
	
	
}return dto;
}
public void displayManagers()
{
	System.out.println("displaying  the all mangers details");
	System.out.println(this.manager.getName()+" "+this.manager.getContactNumber());}

public void displayWorkers() {-=
System.out.println("displaying workers details");

System.out.println(workersDTOs[index].getName()+" "+workersDTOs[index].getWorkerId());
} }
