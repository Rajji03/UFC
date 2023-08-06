package com.backend.ufc.core;

class sthread4 extends Thread{

public void run(){
System.out.println("run called by child thread");	
}
public void start(){
System.out.println("called as a normal method start ");
}

}


public class multi4{
public static void main(String args[]){
sthread4 s1=new sthread4();
s1.start();						
							


}
}