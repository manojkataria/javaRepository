package main.java;

public class MerchantAdapter {
	
	public MerchantUser buildUserData(String allianceCode) {
		
		
		if (allianceCode.equals("FDP")) {
			FDPUser FDPUser = new FDPUser();
			FDPUser.setPOS("abc");
			FDPUser.setTax_id("1001");
			
			return FDPUser;
		} else {
			EMSUser EMSUser = new EMSUser();
			
			EMSUser.setLanguagePreference("en_us");
			EMSUser.setNewsletter("news");
			return EMSUser;	
		}
		
		
	}
}
