package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class MaximumFrequencyWordUsingHashMap {
    public static String  MaximumFrequency(String str){
        String splitStr[] = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String i : splitStr){
            if(map.containsKey(i)) {
                int frequency = map.get(i);
                map.put(i,frequency+1);
            }
            else{
                map.put(i,1);
            }
        }
        String maxFrewWord = "";
        int frequency = Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> currentEntry : map.entrySet() ){
            if(currentEntry.getValue()>frequency){
                maxFrewWord = currentEntry.getKey();
                frequency=currentEntry.getValue();
            }

        }
        return maxFrewWord;
    }
    public static void main(String[] args) {
        System.out.println(MaximumFrequency("Abc Abc asdasdasd"));
    }
}
