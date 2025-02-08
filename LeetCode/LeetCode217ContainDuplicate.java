package LeetCode;

import java.util.*;

//check if array contains any Duplicate or not

class ContainsDuplicate{

    public static boolean checkDuplicate(int[] nums){

        HashSet<Integer> seenNumbers = new HashSet<>();

        //Iterate through each element in the array

        for(int num : nums){
            if (seenNumbers.contains(num)) {
                return true;
            }

            seenNumbers.add(num);

        }

        return false;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int size = 5;
        
        int[] arr = new int[size];//best way to declaration and alloting memory to the array according to java conventions

        // int[] nums = {1,2,3,4,5}; //best way initialize the array

        System.out.print("Enter the 5 element in the array: ");
        for (int i : arr) {
            arr[i] = sc.nextInt();
        }

        boolean flag = checkDuplicate(arr);

        if (flag) {
            System.out.println("Duplicates in the array");
        }
        else{
            System.out.println("No Duplicates in the Array");
        }

        sc.close();


    }
}