package com.interview;

import java.util.ArrayList;

public class Person {
   String name;
   ArrayList<Person> childrens;
   
   Person(String name){
	   this.name=name;
   }
   
   Person(String name,ArrayList<Person> childrens){
	   this.name=name;
	   this.childrens=childrens;
   }
   
   public String getName(){
	   return name;
   }
   public ArrayList<Person> getChildrens(){
	   return childrens;
   }
}
