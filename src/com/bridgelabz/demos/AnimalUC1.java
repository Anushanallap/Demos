package com.bridgelabz.demos;

public class AnimalUC1 {
        void eat(){System.out.println("eating...");}
    }
    class Dog extends AnimalUC1 {
        void bark(){System.out.println("barking...");}
    }
    class TestInheritance{
        public static void main(String args[]){
            Dog d=new Dog();
            d.bark();
            d.eat();
        }
    }


