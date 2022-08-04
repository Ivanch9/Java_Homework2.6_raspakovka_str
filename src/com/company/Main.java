package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str, strNum = "";
        
        System.out.print("Vvedite stroky: ");
        str = input.nextLine().toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                strNum += c;
            }
            else {
                int k;
                if (strNum.isEmpty()) k = 1;
                else {
                    k = Integer.parseInt(strNum);
                    strNum = "";
                }
                for (int j = 0; j < k; j++)
                    System.out.print(c);
            }
        }
    }
}
