package Main2;

import java.util.Scanner;

public class FindSmallestElementArray {
    static int myArr[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Nhập độ dài của mảng vào :");
            int size = sc.nextInt();
            myArr = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.println("Nhập số phần tử vào mảng :" + (i + 1));
                myArr[i] = sc.nextInt();
            }

            int min = myArr[0];
            for (int i = 1; i < myArr.length; i++) {
                if (myArr[i] < min) {
                    min = myArr[i];
                }
            }
            System.out.println("Phần tử nhỏ nhất của mảng là " + min);


        }
    }
}
