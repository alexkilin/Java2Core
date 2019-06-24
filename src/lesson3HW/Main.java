package lesson3HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        String [] words = new String [] {"word", "peace","dog", "cat", "people","table","desk",
                "bird","first","man","two","tree","water","smoke","cat", "table"};
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (!arrayList.contains(words[i])) arrayList.add (words[i]);
        }
        System.out.println(arrayList);
        int num=0;
        for (int i = 0; i <arrayList.size(); i++) {
            num=0;
            for (int j = 0; j < words.length; j++) {
                if (arrayList.get(i).equals(words[j])) {num++;}
                }
            System.out.println(arrayList.get(i)+" "+num);
            }


        }
    }

