package basicjava;
import java.util.*;
public class Buzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		 if (isBuzzNumber(number)) {
	            System.out.println(number + " is a buzz number.");
	        } else {
	            System.out.println(number + " is not a buzz number.");
	        }
	    }

	    public static boolean isBuzzNumber(int number) {
	        // A buzz number ends with 7 and is divisible by 7
	        return (number % 10 == 7) && (number % 7 == 0);
	}

}
