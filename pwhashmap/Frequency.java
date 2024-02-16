/*
Given an array, find the most frequent element in it. if there are multiple elements that appear a maximum number of
times, print any one of them
 */

package pwhashmap;


import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,4,1};
        int n = nums.length;
        System.out.println("\n"+mostfrequentele(nums));
    }
    public static int mostfrequentele(int[] nums){
      Map<Integer , Integer> freq = new HashMap<>();
      //we put all elements in the array into map, and we also count their frequencies as 1 = 3 means 1 occurs 3 times
       for(int ele : nums){
           if(!freq.containsKey(ele)){
               freq.put(ele , 1);
           }
           else{
               freq.put(ele , freq.get(ele)+1);
           }
       } //O(N) -> only of nums array
       //map insertion completed and also counted the frequencies of the elements into the array
        System.out.println(freq.entrySet());

       /*
       Now traversing by 2 methods using for each loop and finding which elements occurs most of the time
        */
        int maxfreq = 0;
        int anskey = -1;
//        for(var ele : freq.entrySet()){
//            if(ele.getValue()>maxfreq){
//                maxfreq = ele.getValue();
//                anskey = ele.getKey();
//            }
//        }

//        now traversing using key set
        for(var key : freq.keySet()){
            if(freq.get(key) > maxfreq){
                maxfreq = freq.get(key);
                anskey = key;
            }
        } //O(N) -> only of nums array
        System.out.printf("%d element has most occurrence and occurs %d times",anskey , maxfreq);
       return maxfreq;
    }
}
