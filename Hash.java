//HASH
//Hash frequency of numbers
//Hashing using numbers
//Hashing with the help of the array
/*
5 //size of the array
1 3 2 1 3 //elements of the array
5 // query of no of occurrence of elements
Output:
 */
//hash is basically counts the frequency of the integer or the symbol that's why its IInteger
// type while declaring the hash
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //size of the array elements
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        //precompute
        int[] nums = new int[n];
        for (int q = 0; q < n; q++) {
            nums[q] = sc.nextInt();
        }
        //array elements get inputted
        //precompute
        int[] hash = new int[13];
        //13 because we assume that that our elements will upto 12
        for (int i = 0; i < n; i++) {
            //hashing incresing the frequency of the elements of the array every times whenever they get
            hash[nums[i]] += 1;//hash will initialise the number of freq by one
        }
        int q;//no of query
        System.out.println("enter no of integer which you want to fetch");
        q= sc.nextInt();
        while (q-->0){
            System.out.println("enter number");
            int number = sc.nextInt();
            //fetching
            System.out.println(number+"->"+hash[number]);
        }
    }
}
