package com.sparta.jag.OOP;

public class App {
    public static void main(String[] args) {

//        Member joe = new Member("joe", "Black", 2025, 2, 12);
//        Member simon = new Member("Simon", "White", 1994, 10,12);
//
//        System.out.println(joe.getFirstName());
//        System.out.println(joe.getFullName());
//        joe.setLastName("Harold");
//        System.out.println(joe.getFullName());
//
//
//        Animal Tiger = new Animal("Tiger", 2023, 12, 1);
//
//        System.out.println(Tiger.getAnimalName());
//        System.out.println(Tiger.getBirthDate());
//        Tiger.setAnimalName("Lion");
//        System.out.println(Tiger.getAnimalName());
//        System.out.println(Tiger.getAge());

//        Dog spike = new Dog("Spike", "Brown", 2015, 10, 12);
//
//        System.out.println(spike.getCoat());

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 10);

        Shape[] shapes = {circle, rectangle};
        for(Shape shape : shapes) {
                System.out.println(shape.toString());
            }
    }

}
