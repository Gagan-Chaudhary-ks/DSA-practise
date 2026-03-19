package Strings;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class CheckAnagrams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first word : ");
        String s1 = sc.nextLine();

        System.out.print("Enter the second word : ");
        String s2 = sc.nextLine();

        boolean res = isAnagram(s1, s2);

        System.out.println(res == true ? "Anagrams" : "Not Anagrams");

    }

    static boolean isAnagram(String s1, String s2){

        s1 = s1.toLowerCase().replaceAll("\\s+","") ;
        s2 = s2.toLowerCase().replaceAll("\\s+","");

        if(s1.length() != s2.length()){
            return false;
        }
        Map <Character, Integer> map = new HashMap<>();

        for(char el : s1.toCharArray()){
            map.put(el, map.getOrDefault(el,0)+1);
        }

        for(char el : s2.toCharArray()){
            if(!map.containsKey(el)){
                return false;
            }
            map.put(el,map.get(el)-1);
            if(map.get(el) < 0){
                return false;
            }
        }

        return true;
    }
}
