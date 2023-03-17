package compn_aggn;

public class launch {

	public static void main(String[] args)
	{
	    student s= new student();
	    
	    bike bi = new bike("yamaha","petrol");
	
	    
	    notebook nb = new notebook("java is fun","abhishek");
		    
	    System.out.println(s.br.getColour());
	    System.out.println(s.br.getWeight());
	    
	    System.out.println(s.he.getcolour());
	    System.out.println(s.he.getweight());
	    
	   s.hasA(nb);
	   s.hasB(bi);
	    
	    
	    
	    
	    
	    
		
		
		
		
		
	}

}
