package ClassAssignments;

class Information {

	private String username = "asdf@gmail.com";

	public String getUsername() {

		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	//Dont use like that bcoz we cant get the vale which is older
	private int otp = 444;
	
/*	public int getOtp() {
		return otp;
	} */
	
	public int setGetOtp(int otp) {
		this.otp = otp;
		return otp;
	}

}



public class EncapsulationSensitiveInfo {

	public static void main(String[] args) {
		Information in = new Information();
		System.out.println(in.getUsername());
		System.out.println(in.setGetOtp(567));

	}

}
