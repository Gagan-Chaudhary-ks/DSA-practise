package Strings;

import java.util.HashSet;
import java.util.Scanner;
import  java.util.Set;

public class RemoveDuplicatesFromAString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        StringBuilder str = removeDuplicates(s);
        System.out.println(str);
    }

    static StringBuilder removeDuplicates(String s){
        StringBuilder str = new StringBuilder();
        Set <Character> set = new HashSet<>();


        for(char el: s.toCharArray()){
            if(!set.contains(el)){
                str.append(el);
                set.add(el);
            }
        }
        return str;
    }
}
