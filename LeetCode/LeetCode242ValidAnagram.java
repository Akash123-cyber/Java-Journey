package LeetCode;

import java.util.Scanner;


class ValidAnagram{

    public static boolean isAnagram(String s ,String t){

        if (s.length()!=t.length()) {
            return false;
        }

        int[] charCounts = new int[26];
        
        for(int i = 0; i<s.length();i++){

            charCounts[s.charAt(i) - 'a']++; //increment
            charCounts[t.charAt(i) - 'a']--; //decrement
        }

        // charCounts[s.charAt(i) - 'a']++;
        // s.charAt(i): This accesses the character at the i-th position in the string s.
        // 'a': This is the ASCII value of the character 'a'. The subtraction s.charAt(i) - 'a' converts the character at i into a number that represents its position in the alphabet (for example, 'a' would become 0, 'b' would become 1, ..., and 'z' would become 25).
        // charCounts[s.charAt(i) - 'a']: This accesses the array charCounts at the index corresponding to the letter at position i in s. For example, if the character is 'a', the index would be 0.
        for(int count : charCounts){
            if(count!=0){
                return false;
            }
        }

        return true;
    };

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String s: ");
        String s = sc.nextLine();
        System.out.print("Enter String t: ");
        String t = sc.nextLine();

        boolean flag = isAnagram(s, t);

        // System.out.println(flag);
        if (flag) {
            System.out.println("Yes Both Strings are Anagram");
        }
        else{
            System.out.println("No Strings are not Anagram of each other");
        }

        sc.close();

    }
}