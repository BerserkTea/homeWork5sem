import java.util.*;

public class FirstHomeWork {
    private Map<String, ArrayList<String>> map = new HashMap<>();

    void add(String firstName, String telNum){
        if (map.containsKey(firstName)){
            map.get(firstName).add(telNum);
        }
        else{
            map.put(firstName, (new ArrayList<>()));
            map.get(firstName).add(telNum);
        }
    }

    String getByName(String firstName){
        return "Абоненту " + firstName + " принадлежат следующие телефоны : " + map.get(firstName);
    }

    String getByTel(String telNumberto){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry:
                map.entrySet()) {
            if(entry.getValue().equals(telNumberto)){
                stringBuilder.append(entry.getKey())
                        .append(" : ")
                        .append(telNumberto)
                        .append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getAll(){
        // for (Map.Entry entry :
        //     map.entrySet()) {
        //     if(true){
        //         System.out.println("Hello");
        //     }

        // }
        return map.toString();
    }
}
