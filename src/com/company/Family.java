package com.company;

import java.util.Arrays;

public abstract class Family implements Payable{

    private Person[] family;
    private String famName;
    private String address;
    private int people;

    public Family(String famName, String address, int people, Person[] family) {
        this.family = family;
        this.famName = famName;
        this.address = address;
        this.people = people;
    }

    @Override
    public String toString() {
        return        "Famaly name " + famName + "\n"+
                "address " + address + "\n" +
                "people " + people  +
      "Persons " + Arrays.toString(family) + "\n" ;
    }
}
