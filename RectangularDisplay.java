package Main2;

import java.util.Scanner;

public class RectangularDisplay {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter choice:");
            choice=s.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the Height:");
                    int a = s.nextInt();
                    System.out.println("Enter the Width:");
                    int b = s.nextInt();
                    for (int i = 1; i <= a; i++) {
                        for (int j = 1; j <= b; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                break;
                case 2: {
                    System.out.println("Enter the Height");
                    int h = s.nextInt();
                    for (int i = 1; i <= h; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                break;
                case 3: {
                    System.out.println("Enter the Height");
                    int h = s.nextInt();
                    for (int i = h; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                break;
                case 4:
                    System.exit(0);
            }
        }while (choice!=4);
    }
}