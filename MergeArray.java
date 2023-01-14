package Main2;

import java.util.Scanner;

public class MergeArray {
    static int firstArr[];
    static int secondArr[];
    static int thirdArr[];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Nhập độ dài của mảng 1 :");
            int firstLength = sc.nextInt();
            firstArr = new int[firstLength];

            for (int i = 0; i < firstLength; i++) {
                System.out.println("Nhập phần tử của mảng 1:");
                firstArr[i] = sc.nextInt();
            }



            System.out.println("Nhập độ dài của mảng 2 :" );
            int secondLength = sc.nextInt();
            secondArr = new int[secondLength];

            for (int i = 0; i < secondLength ; i++) {
                System.out.println("Nhập phần tử của mảng 2" );
                secondArr[i] = sc.nextInt();
            }
            
            thirdArr = new int[firstLength + secondLength];

            for (int i = 0; i < firstLength ; i++) {
                firstArr[i] = thirdArr[i];
            }

            for (int i = 0; i < secondLength; i++) {
                secondArr[i] = thirdArr[secondLength + 1];
            }

            System.out.println("Mảng 1:");
            for (int i = 0; i < firstArr.length; i++) {
                System.out.print(firstArr[i] + " ");
            }

            System.out.println("");

            System.out.println("Mảng 2:");
            for (int i = 0; i < secondArr.length; i++) {
                System.out.print(secondArr[i] + " ");
            }

            System.out.println("");

            System.out.println("Mảng 3:");
            for (int i = 0; i < thirdArr.length; i++) {
                System.out.print(thirdArr[i] + " ");
            }



        }
    }
}
