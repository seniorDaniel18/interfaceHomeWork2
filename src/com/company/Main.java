package com.company;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Луи", 5);
        Person person2 = new Person("Брайн" , 26);
        Person person3 = new Person("Стейси", 25);
        Person person4 = new Person("Том", 25);
        Person person5 = new Person("Молли", 23);
        Person person6 = new Person("Арсений", 29);
        Person person7 = new Person("Мария", 25);

        Family family1 = new Flat("Джонсонс", "Нью Йорк", 3, new Person[]{person1, person2, person3});
        Family family2 = new Dormitory("Мэрлоус", "Вашингтон", 2, new Person[]{person4, person5});
        Family family3 = new Hotel("Поповы", "Москва", 2, new Person[]{person6, person7});

        System.out.println(family1);
        family1.lives();
        family1.pay();

        System.out.println("-------------------");

        System.out.println(family2);
        family2.lives();
        family2.pay();

        System.out.println("-------------------");


        System.out.println(family3);
        family3.lives();
        family3.pay();
    }
}