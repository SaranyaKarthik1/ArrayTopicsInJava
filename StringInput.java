package Assignments;

public class StringInput {

	public static void main(String[] args) {
		
		String value="aabcabcaaz";
		char[] array=value.toCharArray();
		int count;
		
		for(int i=0;i<array.length;i++) {
			count=1;
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]==array[j]) {
					count++;
					array[j]='0';
					
				}
			}

			if(array[i]!='0') {
				System.out.print(array[i]);
			System.out.print(count);
				
		}

	}

	}
	
}
