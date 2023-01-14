package Main2;

import java.util.Scanner;

public class AddElementOfArray {
    static int myArr[];
    static int newArr[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Nhập độ dài của mảng");
            int length = sc.nextInt();
            myArr = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.println("Nhập phần tử của mảng:");
                myArr[i] = sc.nextInt();
            }
            System.out.println("Nhập phần tử cần chèn : ");
            int x = sc.nextInt();

            System.out.println("Nhập vị trí cần chèn");
            int positions = sc.nextInt();

            for (int i = 0; i < myArr.length - 1; i++) {
                if (i <= 1 && i >= args.length - 1) {
                    System.out.println("X không được thêm vào :");
                }
            }
            newArr = new int[length + 1];
            for (int i = 0; i < positions; i++) {
                newArr[i] = myArr[i];
            }

            newArr[positions] = x;

            for (int i = positions; i < myArr.length; i++) {
                newArr[i+1] = myArr[i];
            }

            System.out.println("");
            System.out.println("Mảng cũ");
            for (int i = 0; i < myArr.length; i++) {
                System.out.print(myArr[i] + " ");
            }
            System.out.println("");

            System.out.println("Mảng mới");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }

        }

    }
}

