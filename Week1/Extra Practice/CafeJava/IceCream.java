import java.util.HashMap;
import java.util.Set;
public class IceCream {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Stephanie", "Rocky Road");
        userMap.put("Tremere", "Strawberries n' cream");
        userMap.put("Josh", "Mint Chocolate Chip");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        // for(String key : keys) {
        //     System.out.println(key);
        //     System.out.println(userMap.get(key));
        // }
        System.out.println(userMap); 
        int HowMany = userMap.size();
        System.out.println("Number of students is " + HowMany);
    }
}

