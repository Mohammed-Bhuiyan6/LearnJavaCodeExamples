package learn_inheritance_3Level;

public class LearnVar_Child  extends  LearnVar_Parent {

	                 String  var_c  =  "Child's Variable." ;
	                 
	                 public void  access_parent_var_from_child() {
	                	               System.out.println(var_p);
	                	               System.out.println("accessed using super keyword::  "+ super.var_p);
	                	  }
	                 public void  access_grandparent_var_from_child() {
	                	               System.out.println(var_gp);
	                	               System.out.println("accessed using super keyword::  "+ super.var_gp);
	                 }
	                 
	              public void access_outside_class_object() {
	            	   ch  = new Child();
   		               ch.print_c();
   		               
	              }
	                	 
	                	      
	                	             
	             	public static void main(String[] args) {
	             		  
						/*
						 * LearnVar_Child child = new LearnVar_Child() ;
						 * child.access_grandparent_var_from_child();
						 * child.access_parent_var_from_child(); child.access_grandparent_from_parent();
						 */
	             		            
	             		      ch  = new Child();
	             		            ch.print_c();
	             		            
	             	}
}
