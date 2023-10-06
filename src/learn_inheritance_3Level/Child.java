package learn_inheritance_3Level;

public class Child  extends Parent {
	             public void print_c () {
	            	  
	            	         super.print_p();
	            	         System.out.println("Child's print_c() method called.");
	             }
	             
	         	public static void main(String[] args) {
	         		                
	         	                	Child ch = new Child();
	         	                //	ch.print_gp();
	         	                	
	         	                	ch.print_c();
	         	                	
	         	                	 
	         	                
	         	}

}
