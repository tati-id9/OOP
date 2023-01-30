package org.hw_01;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        familyTree();
    }
    private static void familyTree() {
        Person p1 = new Person("Волков Василий", true);
        Person p2 = new Person("Николаева Аолевтина", false);
        Person p3 = new Person("Семин Александр", true);
        Person p9 = new Person("Алешина Анна", false);
        Person p4 = new Person("Васильева Алена", false);
        Person p5 = new Person("Николаев Иван", true);
        Person p6 = new Person("Коснянов Сергей", false);
        Person p7 = new Person("Цаплин Михайл", true);
        Person p8 = new Person("Симонов Артем", true);

        p1.setFather(p5);
        p1.setMother(p4);
        p1.setChild(p3);
        p2.setMother(p6);
        p2.setFather(p7);
        p2.setChild(p3);
        p5.setFather(p8);
        p9.setSisterOrBrother(p3);
        p9.setMother(p2);
        p9.setFather(p1);
        Person.family.forEach(System.out::println);
    }
}
