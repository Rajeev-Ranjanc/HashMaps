//HASH
import java.util.Scanner;

//Hashing using array
//hashing of string elements
public class UsingChar {
    public static void main(String[] args) {
        //imagine string has only lowercase letters
        Scanner sc = new Scanner(System.in);

        String s;
        System.out.println("enter string:");
        s = sc.next();

        //precompute:
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        System.out.println("enter no of character you want to tbe fetched");
        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("enter the character");
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(c+"->"+hash[c - 'a']);
        }
    }

}
