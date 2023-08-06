package com.backend.ufc.core;

class Camel extends Animal {
    String type = "camel";
}

class Animal {
    String type = "animal";

    public static void main(String[] args) {
        Animal c1 = new Camel();
        Camel c2 = new Camel();
        Animal c3 = c2;
        System.out.print(c1.type+","+c2.type+","+c3.type);
    }
}