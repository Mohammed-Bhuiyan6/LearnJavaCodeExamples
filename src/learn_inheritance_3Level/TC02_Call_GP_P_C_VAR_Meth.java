package learn_inheritance_3Level;

public class TC02_Call_GP_P_C_VAR_Meth {

	public static void main(String[] args) {
	                   
		             LearnVar_Child   var_child  = new LearnVar_Child();
		             
		             //access  all var from grandparent, parent and child class  by creating child class object
		             //  << grandparent >  extends <parent>  extends  <child>   
		             //   Child  ch_o = new Child();
		             
						
						  System.out.println(var_child.var_gp); 
						  System.out.println(var_child.var_p);
						  System.out.println(var_child.var_c);
						  
						  
						  //access all methods from LearnzVar_Child class
						  
						  var_child.access_grandparent_var_from_child();
						  var_child.access_parent_var_from_child();
						  
						  // access method grandparent from parent
						  
						  var_child.access_grandparent_from_parent();
						 
		            
		             //  NOT  access  outside  Class Object from LearnVar_Grandparent  class
		             
					//	  var_child.access_outside_class_object();
		             
		             var_child.access_grandparent_from_parent();
		             
		             
	}

}
