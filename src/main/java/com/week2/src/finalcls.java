package com.week2.src;

public final class finalcls {
    final int x=10;
    final void myMethod(){
        System.out.println("HELLO");
    }
    public static void main(String[] args){
      finalcls obj=new finalcls();
      int y=obj.x;
      obj.myMethod();
      System.out.println(y);
    }
}