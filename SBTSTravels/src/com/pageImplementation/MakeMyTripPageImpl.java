package com.pageImplementation;

import com.page.MakeMyTripPage;
import com.pageImpl.base.BasePageImpl;
import com.utils.PageRequisites;

public class MakeMyTripPageImpl extends BasePageImpl implements MakeMyTripPage {

	
	public MakeMyTripPageImpl(PageRequisites pageRequisites) {
		super(pageRequisites);
	}

	
	@Override
	public void searchTriptDetails(String recordId) {
		
		//genericMethods.setValueInTextBox(fromTextBox, getPageName(), recordId);
		genericMethods.clickElement(fromTextBox, getPageName());
		genericMethods.clickElement(fromCity, getPageName());
		
		//genericMethods.setValueInTextBox(toTextBox, getPageName(), recordId);
		genericMethods.clickElement(toTextBox, getPageName());
		genericMethods.clickElement(toCity, getPageName());
		
		genericMethods.setValueInTextBox(date, getPageName(), recordId);
		genericMethods.clickElement(departureDate, getPageName());
		genericMethods.clickElement(travelers, getPageName());
		
		genericMethods.additionOfTravelers(adultPlus, getPageName(), recordId);
		
		genericMethods.clickElement(advanceOptions, getPageName());
		genericMethods.clickElement(airlineClass, getPageName());
		
		//genericMethods.setValueInTextBox(airlineClass, getPageName(), recordId);
		genericMethods.clickElement(airlineClassOption, getPageName());
		
		genericMethods.clickElement(airlines,  getPageName());
		genericMethods.clickElement(airlinesOption, getPageName());
		
		
		
		//genericMethods.additionOfTravelers(childPlus, getPageName(), recordId);
		
		//genericMethods.additionOfTravelers(infantPlus, getPageName(), recordId);
		
			genericMethods.clickElement(searchBtn, getPageName());
			
			try {
				genericMethods.wait(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			genericMethods.isElementDisplayed(totalFlight, getPageName());
			
			genericMethods.getinnerHTML(totalFlight, getPageName());
				
	}
	
	@Override
	public String getPageName() {
		return "MakeMyTripPage";
	}


}
