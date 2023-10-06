package learn_inheritance_3Level;

public class LearnVar_Grandparent {
	
                String  var_gp  = "Grandparent's Variable." ;
                
                public static  Child  ch ;
                
                public void create_obj() {
                    ch = new Child() ;
                    ch.print_c();
                }
            
                
}
