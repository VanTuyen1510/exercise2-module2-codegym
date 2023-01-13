package Main2;

import java.util.Scanner;

public class PrimeNumberDisplay {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Nhập vào một số bạn muốn :");
        int numbers = sc.nextInt();
        for (int i = 2; i < numbers ; i++) {
           int test = 0;
            for (int j = 1; j <= i ; j++) {
                if(i % j == 0){
                    test++;
                }
            }
            if(test == 2){
                System.out.println(i + " ");
            }
          count++;
        }
    }
}
