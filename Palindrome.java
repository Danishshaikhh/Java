package basicjava;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		// Check if the number is a palindrome
		if(Palindrome(number)) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is not Palindrome");
		}
		sc.close();// Close the Scanner object to prevent resource leak
	}
	 // Function to check if a number is a palindrome
	public static boolean Palindrome(int number){
		int reversed = 0;
		int original = number;
		// Reverse the number
		while(number != 0) { 
			int digit = number % 10; // Extract the last digit
        reversed = reversed * 10 + digit; // Build the reverse number
        number /= 10; // Remove the last digit from the original number
		}
		return original == reversed; // Check if the original number and its reverse are the same
				
	}

}
