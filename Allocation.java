package basicjava;

import java.util.Scanner;

public class Allocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks obtained in English:");
        int english = scanner.nextInt();

        System.out.println("Enter marks obtained in Maths:");
        int maths = scanner.nextInt();

        System.out.println("Enter marks obtained in Science:");
        int science = scanner.nextInt();
        
        if (english >= 80 && maths >= 80 && science >= 80) {
            System.out.println("Stream: Pure Science");
        }else if (english >= 80 && science >= 80 && maths >= 60) {
            System.out.println("Stream: Bio. Science");
        } else if (english >= 60 && maths >= 60 && science >= 60) {
            System.out.println("Stream: Commerce");
        } else {
            System.out.println("Stream: Not eligible for any stream");
        }
    }
}