package abstraction;

public class launch {

	public static void main(String[] args) {
		
		cargoplane cp = new cargoplane();
		passangerplane pp = new passangerplane();
		fighterplane fp = new fighterplane();
		  airpot a = new airpot();
	     
		  a.permit(cp);
		  a.permit(fp);
		  a.permit(pp);
	
	}

}
