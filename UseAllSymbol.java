//HASH
import java.util.Scanner;

//lets assume there is all symbols present int the string both upper case & lower case letters
public class UseAllSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String");
        String  str = sc.next();
        //define hash for the string
        int[] hash= new int[256];
        //precompute
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }

        //no of character to be fetched
        System.out.println("enter no of character you want to fetch:");
        int q;
        q=sc.nextInt();
        while (q-->0){
            System.out.println("enter character you want ot fetch");
            char ch = sc.next().charAt(0);
            System.out.println(str.charAt(hash[ch])+"->"+hash[ch]);
        }
    }
}
