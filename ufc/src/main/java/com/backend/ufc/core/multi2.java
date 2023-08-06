package com.backend.ufc.core;

class sthread2 extends Thread{

public void run(){
System.out.println("Second thread started by main thread than called");	//executed by child thread
}
public void run(int a){System.out.println(" called as a normal method");}
}


public class multi2{
public static void main(String args[]){
sthread2 s1=new sthread2();
s1.start();						//child thread created
							//run without parameter is called


}
}