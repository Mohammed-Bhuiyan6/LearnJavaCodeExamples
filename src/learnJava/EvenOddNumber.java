package learnJava;

public class EvenOddNumber {

	public static void main(String[] args) {
		           
		/*
		 * try (Scanner scn = new Scanner(System.in)) {
		 * System.out.print("Enter a number: "); int num = scn.nextInt();
		 * 
		 * if (num%2 == 0) System.out.println(num + " is even"); else
		 * System.out.println(num + " is odd"); }
		 */
		int[] myNum = {5,4,2,1,7,8,9,10};
		   System.out.println( " -------even numbers -------------     " );
		for (int  even  :  myNum) {
			
			     if ( even %2 == 0)
			    	 System.out.print("     "+ even +"     ");
				   
		
			 }
		    System.out.println();
		    System.out.println( " -------odd numbers -------------     " );
		    
		for (int  odd  :  myNum) {
			
		     if ( odd % 2  != 0)
		    	 System.out.print("      "+odd+"     ");
			   
		  //   System.out.println("------------------");
		 }
		
		/*
		 * for (int i = 1; i<=10 ; i ++) { if (i%2 == 0)
		 * System.out.println("even numbers are :"+i); else
		 * System.out.println("  odd numbers are : "+ i); }
		 */
	}

}
