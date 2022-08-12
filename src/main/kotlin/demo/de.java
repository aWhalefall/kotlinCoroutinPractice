package demo;

import java.util.ArrayList;
import java.util.List;

public class de {

    public static void main(String[] args) {
        List list = new ArrayList<Dog>();
        list.add(new Dog());
        list.add(new Dog());
        list.add(new Dog());
        List<? extends Animal> readList = list;
        System.out.println(readList.get(0) instanceof Dog);
    }

}

