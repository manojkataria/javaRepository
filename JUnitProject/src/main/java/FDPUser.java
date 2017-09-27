package main.java;

public class FDPUser implements MerchantUser {
	private String tax_id;
	private String POS;
	
	public String getTax_id() {
		return tax_id;
	}
	public void setTax_id(String tax_id) {
		this.tax_id = tax_id;
	}
	public String getPOS() {
		return POS;
	}
	public void setPOS(String pOS) {
		POS = pOS;
	}
	@Override
	public String toString() {
		return "FDPUser [tax_id=" + tax_id + ", POS=" + POS + "]";
	}
	@Override
	public void userInformation() {
		System.out.println("FDPUser.userInformation()...!!!!");
		
	}


}
