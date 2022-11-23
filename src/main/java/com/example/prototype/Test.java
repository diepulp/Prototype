package com.example.prototype;

import com.example.prototype.car.Car;
import com.example.prototype.car.Prototype;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr = {0, 1, -1, -2, 1, 3, 4};
        for (int i : arr){

        }
        int sum  = Arrays.stream(arr).filter(i -> i % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        long answer = 1 / 3;
        System.out.println(answer);

        Circle circle = new Circle();
        circle.color = "red";
        circle.x = 10;
        circle.y = 20;

        Circle anotherCircle = (Circle)circle.clone();

        System.out.println(circle);
        System.out.println(anotherCircle);
        System.out.println("Two circles are clones: " + circle.equals(anotherCircle));


        Prototype car = new Car();
        ((Car) car).setMake("Volvo");
        Prototype newCar = car.copy(car);
        System.out.println("Car " + car);
        System.out.println("New Car " + newCar);
        System.out.println("The cars are the same object: " + car.equals(newCar));

        ((Car) newCar).setMake("BMW");
        System.out.println(car);
        System.out.println(newCar);

        Fruit fruit = new Fruit("apple", "washington");
        System.out.println(fruit);
    }
}
