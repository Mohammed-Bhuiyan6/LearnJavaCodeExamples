package learnJava;

import java.util.Date;

public class GetClassName {

	
	public static void main(String[] args) {
	 
    System.out.println(dtTime());
		  
    
		  
		
		}
	
	static String dtTime() {
		 String className = new Object() {}
       .getClass()
       .getEnclosingClass()
       .getName();
       
     
			
			  Date date = new Date(); String 
			  tc = className+"_Execution date= "+date;
			 
       //System.out.println("Current Class is " + className+"_Execution date= "+date);
		//return className;
			  
			  return tc;
	
	}


	}


