package Main2;

import java.util.Scanner;

public class DeleteElementOfArray {
    static int myArr[];

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);{
            System.out.println("Nhập độ dài của mảng");
            int length = sc.nextInt();
             myArr = new int[length];

            for (int i = 0; i < myArr.length; i++) {
                System.out.println("Nhập phần tử của mảng:");
               myArr[i] = sc.nextInt();
         }

            System.out.println("Nhập phần tử cần xóa :");
            int x = sc.nextInt();
            int index_del = 0;

            for (int i = 0; i < myArr.length ; i++){
                if(myArr[i] == x){
                    index_del = i;
                    break;
                }
            }
            for (int i = index_del; i < myArr.length-1 ; i++) {
                    myArr[i] = myArr[i+1];
            }
            myArr[ myArr.length-1] = 0;

            System.out.println("");
            System.out.println("Mảng mới: ");
            for (int i = 0; i < myArr.length; i++) {
                System.out.print(myArr[i] + " ");
            }
        }
    }
}
