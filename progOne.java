package HW.Java_Hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class progOne {
//добавление номера
    public static void addNumber(String key, int value, Map < String, ArrayList<Integer> > map) {
        if (map.containsKey(key)){
            map.get(key).add(value);
        }else{
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
        
    }
    //метод новых контактов
    public static void printBook(Map<String, ArrayList<Integer> > map) {
        for (var item : map.entrySet()) {
            String phons = "";
            for(int el : item.getValue()) {
                phons = phons + el + ", ";
            
            }
            System.out.printf("%s: %s \n", item.getKey(), phons);            
            
        }
        public static void main(String[] args) {
            Map < String, ArrayList<Integer>> bookPhone = new HashMap<>(0, 0);
        addNumber("Ivanov", 123, bookPhone);
        addNumber("Ivanov", 1234, bookPhone);
        addNumber("Petrov", 546585, bookPhone);
        addNumber("Sidorov", 8956477, bookPhone);
        addNumber("Ivanov", 12356233, bookPhone);
        addNumber("Petrov", 787897, bookPhone);
        printBook(bookPhone);
        }
        
    }
    
}
