package ArraysAssignment;

public class MultiplicationArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,2},{3,4}};    
		int b[][]={{5,6,7},{8,9,10}};    
		    
		//creating another matrix to store the multiplication of two matrices    
		int c[][]=new int[2][3];  //2 rows and 3 columns  
		    
		//multiplying and printing multiplication of 2 matrices    
		for(int i=0;i<2;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<2;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}//end of k loop  
		System.out.print(c[i][j]+" ");  //printing matrix element  
		}//end of j loop  
		System.out.println();//new line    
		}    
		}

	}


