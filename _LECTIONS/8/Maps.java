import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Maps {



    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("2", "Odin");
        map.put("1", "Dva");

        for (String key : map.keySet()) {
            System.out.println(key);
        }
        for (String value : map.values()) {
            System.out.println(value);
        }

        for (Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
