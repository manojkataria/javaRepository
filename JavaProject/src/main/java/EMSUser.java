package main.java;

public class EMSUser implements MerchantUser {
	
	private String languagePreference;
	private String newsletter;
	
	public String getLanguagePreference() {
		return languagePreference;
	}
	public void setLanguagePreference(String languagePreference) {
		this.languagePreference = languagePreference;
	}
	public String getNewsletter() {
		return newsletter;
	}
	public void setNewsletter(String newsletter) {
		this.newsletter = newsletter;
	}
	@Override
	public String toString() {
		return "EMSUser [languagePreference=" + languagePreference + ", newsletter=" + newsletter + "]";
	}
	@Override
	public void userInformation() {
		System.out.println("EMSUser.userInformation()....");
		
	}
	
	
	

}
