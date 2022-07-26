package com.company;

public class Hotel extends Family{

    public Hotel(String famName, String address, int people, Person[] family) {
        super(famName, address, people, family);
    }

    @Override
    public void pay() {
        System.out.println("платят за аренду");
    }

    @Override
    public void lives() {
        System.out.println("живут в хостеле");
    }
}
