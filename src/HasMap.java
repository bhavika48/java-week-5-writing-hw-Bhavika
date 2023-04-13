import java.util.HashMap;
import java.util.Map;

public class HasMap {
    public static void main(String[] args) {
        HashMap<String, Integer> peopleNumber = new HashMap<>();
        peopleNumber.put("Monday",102);
        peopleNumber.put("Tuesday",102);
        peopleNumber.put("Wedenesday",102);
        peopleNumber.put("Thursday",102);
        peopleNumber.put("Friday",102);
        peopleNumber.put("Saturday",102);
        peopleNumber.put("Sunday",102);
        for(Map.Entry<String,Integer> peopleNum : peopleNumber.entrySet()){
            System.out.println(peopleNum.getKey()+ "="+ peopleNum.getValue());
        }
    }
}

