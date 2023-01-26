package Main2;

import java.util.Scanner;

public class SumOfMainDiagonals {
    static double myArr2D[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter the line number :");
            int currentLength = sc.nextInt();

            System.out.println("Enter the column number :");
            int columnLength = sc.nextInt();

            myArr2D = new double[currentLength][columnLength];

            for (int i = 0; i < columnLength; i++) {
                for (int j = 0; j < currentLength; j++) {
                    System.out.println("Enter the line number : " + i + 1 + " and " + " Enter the column number :" + j + 1);
                    myArr2D[i][j] = sc.nextInt();
                }
            }
            System.out.print("The array you just entered is:" + ":");
            for (int i = 0; i < currentLength; i++) {
                for (int j = 0; j < columnLength; j++) {
                    System.out.println(myArr2D[i][j]);
                }
            }

            double sum  = 0;
            for (int i = 0 ;i< currentLength;i++){
                sum += myArr2D[i][i];
        }
            System.out.println("The sum of the main diagonals is:"+ sum);

        }
    }
}
