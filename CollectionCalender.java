package Assignments;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;   
public class CollectionCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		   System.out.println(java.time.LocalDate.now());
		   System.out.println(java.time.LocalDateTime.now());
		  }    
		    
		
	}


//System.out.println(java.time.LocalDate.now());    
     