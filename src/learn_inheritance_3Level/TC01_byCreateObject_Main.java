package learn_inheritance_3Level;

public class TC01_byCreateObject_Main {

	public static void main(String[] args) {
		
		      Child   c  =  new  Child();
		                 c.print_c();            //  output :  gp  ;  p  ;  c
		      //directly call
		  System.out.println("**********directly call from gp , p and c class*************");
		                c.print_gp();          // output :   gp 
		                c.print_p();            //  output :  gp  ;  p
		                c.print_c();            //  output :  gp  ;  p  ;  c
              
	}

}
