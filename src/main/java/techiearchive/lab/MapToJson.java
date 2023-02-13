package techiearchive.lab;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class MapToJson {

    public static void main(String []args) {
        Map<Integer, String> personMap = new HashMap<>();
        personMap.put(20, "p1");
        personMap.put(22, "p2");
        Gson gson = new Gson();

        String output = gson.toJson(personMap);
        System.out.println(output);
    }
}