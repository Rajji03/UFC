package com.backend.ufc.core;

 interface Comic<C> {
   void draw(C c);
 }
  class ComicClass<C> implements Comic<C> {
     public void draw(C c) {
           System.out.println(c);
      }
 }
 class SnoopyClass implements Comic<Snoopy> {
   public void draw(Snoopy c) {
     System.out.println(c);
     }
 }
class SnoopyComic implements Comic<Snoopy> {
//   public void draw(C c) {
//              System.out.println(c);
//   }
//
    @Override
    public void draw(Snoopy snoopy) {

    }
}
 public class Snoopy {
    public static void main(String[] args) {
             Comic<Snoopy> c1 = c -> System.out.println(c);
             Comic<Snoopy> c2 = new ComicClass<>();
              Comic<Snoopy> c3 = new SnoopyClass();
              Comic<Snoopy> c4 = new SnoopyComic();
       }
 }