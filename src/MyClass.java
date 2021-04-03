
import org.w3c.dom.ls.LSOutput;


import java.util.*;

public class MyClass {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3};
        System.out.println(countOnes(999));
    }


    public static int countOnes(int n) {
        String result = Integer.toBinaryString(n);
        int count =0;

        for (int i=0;i<result.length(); i++) {
            if (result.charAt(i)=='1')
                count++;
        }
return count;
    }

 /*   public static double[] minMax(double[] arr) {
        double arr1[] = new  double[2];
        Double arr2[] = new Double[arr.length];
        for (int i=0 ; i<arr.length; i++) {
            arr2[i]= arr[i];
        }

       arr1[0] = Collections.min(Arrays.asList(arr2));
        arr1[1] = Collections.max(Arrays.asList(arr2));
return arr1;
    } */

   /* public static boolean ifCharIsVowel(char c ){
        Character ch = Character.toUpperCase(c);
        if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return true;
        else return false;
    } */

}