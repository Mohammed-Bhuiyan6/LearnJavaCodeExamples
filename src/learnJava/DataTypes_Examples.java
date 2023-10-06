package learnJava;

public class DataTypes_Examples {

	public static void main(String[] args) {
		
		              /*  Byte
		               *   byte data type store memory location size range from -128  to 127  
		               *   and contain 3 digits number.
		               *   memory space = 1 byte
		               */
		
		                byte mimimum_byte_value = -128;
		                byte maximum_byte_value = 127; // +3 digits or -3  digits [positive or negative]
		        
		                System.out.println("==========Examples of Byte Data Type ==========");
		                System.out.println("_MINIMUM_SIZE_OF_BYTE_TYPE_VALUE    = "+ mimimum_byte_value);  
		                System.out.println("_MAXIMUM_SIZE_OF_BYTE_TYPE_VALUE    = "+ maximum_byte_value);  
		       
		                /*  short
	                      *   short data type store memory location  size range from  -32,768 to 32,767  
	                      *   and contain 5 digits number.
	                      *   memory space = 2 bytes
	                      */
		                
		                short minimum_short_value = -32768;  // +5 digits or -5 digits
		                short maximum_short_value = 32767;
		                
		                System.out.println("==========Examples of Short Data Type ==========");
		                System.out.println("_MINIMUM_SIZE_OF_SHORT_TYPE_VALUE = "+ minimum_short_value);  
		                System.out.println("_MAXIMUM_SIZE_OF_SHORT_TYPE_VALUE = "+maximum_short_value);
                          
		                 /*    Int
			               *   int data type store memory location size range from -2,147,483,648 to 2,147,483,647
			               *   and contain 10 digits numbers  [positives or negatives ]
			               *    memory space = 4 bytes
			               */
			
			                int  minimum_int_value =  -2147483648 ;
			                int  maximum_int_value =   2147483647 ;                        // +10 digits or -10  digits [positive or negative]
			        
			                System.out.println("==========Examples of Int Data Type ==========");
			                System.out.println("_MINIMUM_SIZE_OF_INT_TYPE_VALUE    = "+ minimum_int_value);  
			                System.out.println("_MAXIMUM_SIZE_OF_INT_TYPE_VALUE    = "+maximum_int_value);  
			                
			       
			                /*  long
		                      *   long data type store memory location  size range from  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		                      *   and contain 19 digits  positive or negative number.
		                      *    memory space = 8 bytes
		                      */
			                
			                long minimum_long_value =   -9223372036854775808L ;    // +19 digits or -5 digits
			                long  maximum_long_value =  9223372036854775807L ;
			                
			                System.out.println("==========Examples of Longt Data Type ==========");
			                System.out.println("_MINIMUM_SIZE_OF_LONG_TYPE_VALUE = "+ minimum_long_value);  
			                System.out.println("_MAXIMUM_SIZE_OF_LONG_TYPE_VALUE = "+maximum_long_value);   
			                
			                /*  float
		                      *  float data type Stores fractional numbers.Sufficient for storing 6 to 7 decimal digits
		                      *   
		                      *    memory space = 4 bytes
		                      */
			                
			                float  negative_2decimal_float_value  =   -5.75f ;
			                float  positive_2decimal_float_value   =     5.75f ;
			                
			                System.out.println("==========Examples of float Data Type ==========");
			                System.out.println("_NEGATIVE_FLOAT_TYPE_2_DECIMAL_VALUE  = "+ negative_2decimal_float_value);  
			                System.out.println("_POSITIVE_FLOAT_TYPE_2_DECIMAL_VALUE   = "+  positive_2decimal_float_value);   
			                
			                /*  double
		                      *  double data type Stores fractional numbers. Sufficient for storing 15 decimal digits
		                      *   
		                      *    memory space = 8 bytes
		                      */
			                
			                double  negative_2decimal_double_value  =   -5.75d ;
			                double  positive_2decimal_double_value   =     5.75d ;
			                
			                System.out.println("==========Examples of double Data Type ==========");
			                System.out.println("_NEGATIVE_DOUBLE_TYPE_2_DECIMAL_VALUE  = "+ negative_2decimal_double_value);  
			                System.out.println("_POSITIVE_DOUBLE_TYPE_2_DECIMAL_VALUE   = "+  positive_2decimal_double_value);   
			                
			                /*  boolean
		                      *  boolean data type Stores true or false value
		                      *   
		                      *    memory space = 1 bit 
		                      */
			                
			                boolean  negative_boolean_value  =    false ;
			                boolean  positive_boolean_value   =     true ;
			                
			                System.out.println("==========Examples of boolean Data Type ==========");
			                System.out.println("_NEGATIVE_BOOLEAN_VALUE  = "+ negative_boolean_value);  
			                System.out.println("_POSITIVE_BOOLEAN_VALUE   = "+  positive_boolean_value);   
			                
			                /*  char
		                      *  char data type Stores a single character/letter
		                      *   
		                      *    memory space = 2 bytes 
		                      */
			                
			                char  lowercase_char_value  =    'a';
			                char  uppercase_char_value  =   'A';
			                
			                System.out.println("==========Examples of char Data Type ==========");
			                System.out.println("_LOWERCASE_CHAR_VALUE  = "+ lowercase_char_value);  
			                System.out.println("_UPPERCASE_CHAR_VALUE   = "+  uppercase_char_value);   
			                
			                
			                /*
			                 *  String  Type
			                 */
			                
			                String firstName = "Zeeshan  ";
			                String lastName = "Bhuiyan";
			                String fullName = firstName + lastName;
			                System.out.println(fullName);  
	}

}
