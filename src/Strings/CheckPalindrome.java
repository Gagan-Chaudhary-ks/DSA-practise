package Strings;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String input = sc.nextLine();

        input = input.toLowerCase();

        int i=0;
        int j= input.length() -1;
        boolean isPalindrome = true;

        while(i<j){
            if(input.charAt(i) == ' '){
                i++;
                continue;
            }
            else if(input.charAt(j) == ' ') {
                j--;
                continue;
            };

            if(input.charAt(i) != input.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPalindrome == true ? "Palindrome" : "Not a Palindrome");
    }
}
