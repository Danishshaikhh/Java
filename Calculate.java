package basicjava;

public class Calculate {

	public static void main(String[] args) {
	    int[] numbers = {2, 3, 4};

        // Iterate through each number in the array
        for (int num : numbers) {
            // Calculate the square of the number
            int square = num * num;
            // Calculate the cube of the number
            int cube = num * num * num;
            // Output the square and cube
            System.out.println(square);
            System.out.println(cube);
        }
        }

}
