import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int arr[] = {3, 4, 2, 1};


        HashMap<Character, Integer> map = new HashMap<>();
        String str = "sdaadssfdsfdfgdgdf";
        for (int i = 0; i < str.length(); i++) {
            Character aa = str.charAt(i);
            if (map.containsKey(aa)) {
                map.put(aa, map.get(aa) + 1);
            } else {
                map.put(aa, 1);
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }


        /*
        У символа ключ значение вхождений в строку
         */
        //char c = str.charAt(4);
        // System.out.println(c);
    }

    public static class User {
        String user;


        int age;
    }


}