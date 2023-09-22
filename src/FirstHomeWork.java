// Задание

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstHomeWork{
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

    String getAllSorted(){
        List<String> keysArrayList = new ArrayList<String>();
        for (Map.Entry entry :
                map.entrySet()) {
            keysArrayList.add(entry.getKey().toString());
            // System.out.println(entry.getKey().getClass().getName());
        }
        for (int i = 1; i < keysArrayList.size(); i++) {
            for (int j = 0; j < keysArrayList.size(); j++) {
                if(map.get(keysArrayList.get(i)).size() > map.get(keysArrayList.get(j)).size()){
                    Collections.swap(keysArrayList, i, j);
//                    System.out.println(keysArrayList.toString());
                }
            }
        }
        // ArrayList<Integer> valuesArrayList = new ArrayList<Integer>();
        // for (String string : keysArrayList) {
        //     valuesArrayList.add(map.get(string).size());
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k <keysArrayList.size(); k++){
            stringBuilder
                    .append(keysArrayList.get(k))
                    .append(" : ")
                    .append(map.get(keysArrayList.get(k)))
                    .append("\n");
        }
        return stringBuilder.toString();
    }
    // return map.get("Гробушка");
    // return map.toString();
}
// @Override
// public int compareTo(FirstHomeWork o) {
//     return 0;
// }
//    void sortMap(Map needToSortMap){
//        maxLenght = 0;
//        for (Map.Entry entry :
//             map.entrySet()) {
//            if(entry.)
//    }
//    }
