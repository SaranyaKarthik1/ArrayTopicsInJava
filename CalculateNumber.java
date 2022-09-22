

public class CalculateNumber {

	public static void main(String[] args) {
		
int n=3238533;
int temp=n%10;
int count=0;
while(n!=0) {
	int sum=n%10;
	if(temp==sum) {
		count++;
	}
	n=n/10;
}
System.out.println(count);
	}

}
