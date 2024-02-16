//HashMap
//stores values pair method
//this code is gonna count the frequency of the elements
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        //geeting input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //precompute
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if(map.containsKey(key)) freq = map.get(key);
            freq++;
            map.put(key , freq);

        }
        //iterate over hashmap
//        for(Map.Entry<Integer , Integer> it:map.entrySet()){
//            System.out.println(it.getKey()+"->"+it.getValue());
//        }
        System.out.println("enter no of integer you want to fetch");
        int q = sc.nextInt();
        while (q-->0){
            System.out.println("enter number");
            int number = sc.nextInt();
            //fetching
            if(map.containsKey(number)){
                System.out.println(number+"->"+map.get(number));
            }
            else{
                System.out.println("null");
            }

        }

    }

}
