package DataStructure;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class UniqueCharactersHashMap {
    public static String uniqueChar(String str){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),i);
        }
        String ans = "";
        for(Character key : map.keySet()){
            ans += key;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(uniqueChar("aabfffcdd"));
    }
}
