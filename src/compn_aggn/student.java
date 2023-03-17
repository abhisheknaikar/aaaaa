package compn_aggn;

public class student {

   brain br = new brain(200,"pink");
   heart he = new heart(250,"red");

   public void hasA(notebook nb)
   {
	   System.out.println(nb.getname());
	   System.out.println(nb.getauther());  
   }
   public void hasB(bike bi)
   {
	   System.out.println(bi.getbrand());
	   System.out.println(bi.getenginetype());
   }
}
