package com.backend.ufc.core;

interface Plant {
    default String grow() { return "Grow!"; }
}
interface Living {
    public default String grow() { return "Super Growing!"; }
}
class Tree implements Plant, Living {  // m1
    public String grow() { return Plant.super.grow(); }
    public static void main(String[] leaves) {
        Plant p = new Tree();                   // m2
        System.out.print(((Living)p).grow());   // m3
        System.out.print(((Plant)p).grow());
    }
}