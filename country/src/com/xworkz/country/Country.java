package com.xworkz.country;

public class Country {
	private int noOfStates;
	private int noOfLanguages;
	private String capital;

	/*public Country(int noOfStates, int noOfLanguages,String capital) {
		this.noOfStates=noOfStates;
		this.noOfLanguages=noOfLanguages;
		this.capital=capital;
	}*/
		public void develop()
		{
			System.out.println("countries are in developing stages");
		}

		public int getNoOfStates() {
			return noOfStates;
		}

		public void setNoOfStates(int noOfStates) {
			this.noOfStates = noOfStates;
		}

		public int getNoOfLanguages() {
			return noOfLanguages;
		}

		public void setNoOfLanguages(int noOfLanguages) {
			this.noOfLanguages = noOfLanguages;
		}

		public String getCapital() {
			return capital;
		}

		public void setCapital(String capital) {
			this.capital = capital;
		}
		
		
	}

