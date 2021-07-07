package lesson3HW;

import java.util.*;

public class PhoneBook {

    private static Map <String , ArrayList> phonebook = new HashMap<>();
    public static void main(String[] args) {

        add("Ivanov", "+7(999)888-66-77");
        add("Ivanov","+781266666666");
        add("Petrov","911");
        get("Ivanov");
        get("Petrov");
        get("Sidorov");

    }

    static void add ( String name, String number){
      ArrayList<String> phonenums = phonebook.get(name);
       if (phonenums==null) {
            phonenums = new ArrayList<String>();
        }
        if (!phonenums.contains(number)) {
            phonenums.add(number);
            phonebook.put(name,phonenums);}

    }
   static void get (String name) {
      Set<Map.Entry<String,ArrayList>> mapAsSet=phonebook.entrySet();
      boolean isFound=false;
       for (Map.Entry<String, ArrayList> mapAsSetEntry:mapAsSet) {
           if (mapAsSetEntry.getKey().equals(name)) {
               System.out.printf(" Номера телефонов для %s:\n",name);
               System.out.println(mapAsSetEntry.getValue());
               isFound=true;
           }
       }
           if (!isFound) System.out.printf("Данных по фамилии %s не имеется \n",name);

           }
}



