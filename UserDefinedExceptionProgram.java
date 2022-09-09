package ArraysAssignment;



	
		// TODO Auto-generated method stub
		class   UserDefinedExceptionProgram1 extends Exception  
		{  
		    public UserDefinedExceptionProgram1(String string) {
				// TODO Auto-generated constructor stub
			}

			
		}  
		    
		 
	 public class UserDefinedExceptionProgram
		{  
		  
		    static void validate (int age) throws UserDefinedExceptionProgram1{    
		       if(age < 18){  
		    	   throw new UserDefinedExceptionProgram1("age is not valid to vote");    
		       }  
		          else {   
		           System.out.println("welcome to vote");   
		           }   
		        }    
		     
		       // main method  
		       public static void main(String args[])  
		       {  
		           try  
		           {  
		            validate(13);  
		           }  
		           catch (UserDefinedExceptionProgram1 ex)  
		           {  
		               System.out.println("Caught the exception");  
		       
		               
		               System.out.println("Exception occured: " + ex);  
		           }  
		     
		           System.out.println("rest of the code...");    
		       }  
		   }  
		      