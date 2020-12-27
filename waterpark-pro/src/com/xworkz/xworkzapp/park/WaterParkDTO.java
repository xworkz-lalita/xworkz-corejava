package com.xworkz.xworkzapp.park;

public class WaterParkDTO {//it is "has a" relationship-class which has the reference.
        private String rides;
        private ManagerDTO manager;//the manger will be one -one WP-one-manager
        private WorkersDTO[] workers;//the workers will be n numbers so it need array-one to many relation
		public String getRides() {
			return rides;
		}
		public void setRides(String rides) {
			this.rides = rides;
		}
		public ManagerDTO getManager() {
			return manager;
		}
		public void setManager(ManagerDTO manager) {
			this.manager = manager;
		}
		public WorkersDTO[] getWorkers() {
			return workers;
		}
		public void setWorkers(WorkersDTO[] workers) {
			this.workers = workers;
		}
        
        
}
