package iterativestatement;

public class ReverseTheNumber {
	public static void main(String[] args) {
		 System.out.println("reverse the number 1234");
		 int num = 1234;
		 int sum = 0;
		  for( ;num > 0; num=num/10) {
			  int r = num % 10;
			  sum = sum*10 + r;
		 }
		  System.out.println(sum); 
			} 
}
