package com.company;

public class Flat extends Family{

    public Flat(String famName, String address, int people,Person[] family) {
        super(famName, address, people, family);
    }

    @Override
    public void pay() {
        System.out.println("платят ком услуги");
    }

    @Override
    public void lives() {
        System.out.println("живут в квартире");
    }
}
