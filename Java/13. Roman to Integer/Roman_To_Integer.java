import java.util.HashMap;
import java.util.Map;

public class Roman_To_Integer {
    
    class Solution {
        public int romanToInt(String s) {
            //Creating the map to store the roman numericals and their integer representations
            Map<Character, Integer> m = new HashMap<>(); 
            m.put('I', 1);
            m.put('V', 5);
            m.put('X', 10);
            m.put('L', 50);
            m.put('C', 100);
            m.put('D', 500);
            m.put('M', 1000);

            int result = 0; //store the answer
            int size = s.length(); //store string size

            for(int i = 0; i < size; i++){
                if(i < size - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
                    result -= m.get(s.charAt(i));
                } else {
                    result += m.get(s.charAt(i));
                }
            }
            return result;
        }
    }
}