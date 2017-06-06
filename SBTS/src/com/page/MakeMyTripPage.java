package com.page;

import com.page.base.BasePage;

public interface MakeMyTripPage extends BasePage{
	
	public String fromTextBox = "fromTextBox";
	public String fromCity = "fromCity";
	public String toTextBox = "toTextBox";
	public String toCity = "toCity";
	public String date = "date";
	
	public String departureDate="departureDate";
	 public String travelers="travelers";
	 
	 public String adultPlus="adultPlus";
	 public String childPlus="childPlus";
	 public String infantPlus="infantPlus";
	 
	 public String adultMinus="adultMinus";
	 public String childMinus="childMinus";
	 public String infantMinus="infantMinus";
	 
	 public String advanceOptions="advanceOptions";
	 public String airlineClass="airlineClass";
	 public String airlineClassOption="airlineClassOption";
	 
	 public String airlines="airlines";
     public String airlinesOption="airlinesOption";
	 
	public String searchBtn = "searchBtn";
	public String   totalFlight="totalFlight";
	
	public void searchTriptDetails(String recordId);

}
