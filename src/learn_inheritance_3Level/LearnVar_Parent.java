package learn_inheritance_3Level;

public class LearnVar_Parent  extends LearnVar_Grandparent{
	               
                  String var_p  = "Parent's variable." ;
                  
                  public void  access_grandparent_from_parent () {
                	            System.out.println(var_gp);
                	            System.out.println("accessed using super keyword::  "+ super.var_gp);
                	            create_obj();           
                  }
                
}
