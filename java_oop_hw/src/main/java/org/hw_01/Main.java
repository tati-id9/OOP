package org.hw_01;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       task1();
    }
    private static void task1() {
        Person p1 = new Person("Вася", true);
        Person p2 = new Person("Маша", false);
        Person p3 = new Person("Коля", true);
        Person p9 = new Person("Алевтина", false);
        Person p4 = new Person("Василиса Петровна", false);
        Person p5 = new Person("Николай Иванович", true);
        Person p6 = new Person("Ольга Бузова", false);
        Person p7 = new Person("Тимур Батрутдинов", true);
        Person p8 = new Person("Филипп Киркоров", true);

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
