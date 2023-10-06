package learn_inheritance_3Level;

public class Parent  extends Grandparent{
	            public void print_p () {
	            	  //    print_gp();
	            	      super.print_gp();
	            	      System.out.println("Parent's Print_p() method called.");
	            	      
	            	      Parent  parent  =  new Parent ();
	            	      parent.print_gp();
	            }

}
