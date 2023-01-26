package Main2;

import java.util.Scanner;

public class CharacterCountInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Dang Van Tuyen";


        System.out.print("Enter one character");
        char c = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(c == str.charAt(i)){
                count++;
            }
        }
        System.out.println("The value of the counter variable is: " + count);
    }
}
