import java.util.*;
class Solution {
    public static int lengthOfLastWord(String s) {
        String[] a=s.split(" ");
        String b=a[a.length-1];
        int c= b.length();
        System.out.println(b);
        return c;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        lengthOfLastWord(s);
    }
}
