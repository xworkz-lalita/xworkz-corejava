package src.com.xworkz.xworkzapp.flightbooking;

public class FlightBookingDTO {
	private long code;
	private String company;
	private String startingPoint;
	private String destination;
	private int totalSeats;
	private boolean domestic;
	private double businessClassPrice;
	private double economyClassPrice;

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public boolean isDomestic() {
		return domestic;
	}

	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}

	public double getBusinessClassPrice() {
		return businessClassPrice;
	}

	public void setBusinessClassPrice(double businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}

	public double getEconomyClassPrice() {
		return economyClassPrice;
	}

	public void setEconomyClassPrice(double economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}


}
