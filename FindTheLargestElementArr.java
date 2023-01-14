package Main2;

import java.util.Scanner;

public class FindTheLargestElementArr {
    static double myArr2D[][];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Nhập số dòng");
            int currentLength = sc.nextInt();

            System.out.println("Nhập số cột");
            int columnLength = sc.nextInt();

            myArr2D = new double[currentLength][columnLength];

            for (int i = 0; i < columnLength ; i++) {
                for (int j = 0; j < currentLength; j++) {
                    System.out.println("Nhập số dòng" + i + 1 + "và" + "Nhập số cột" + j + 1);
                    myArr2D[i][j] = sc.nextInt();
                }
            }
            System.out.print("Mảng vừa nhập vào là:" + ":");
            for (int i = 0; i < currentLength ; i++) {
                for (int j = 0; j < columnLength; j++) {
                    System.out.println(myArr2D[i][j]);
                }
            }

            int row = 0;
            int col = 0;
            double maxElement = myArr2D[0][0];
            for (int i = 0; i < currentLength ; i++) {
                for (int j = 0; j < columnLength; j++) {
                    if(maxElement < myArr2D[i][j]){
                        maxElement = myArr2D[i][j];
                        row = i + 1;
                        col = i + 1;
                    }
                }
            }
           System.out.println("Phần tử lớn nhất trong mảng là :" + maxElement);




        }

    }


}
