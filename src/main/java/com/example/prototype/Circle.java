package com.example.prototype;

public class Circle extends Shape {

    public int radius;

    @Override
    public String toString() {
        return "Circle{" +
               "radius=" + radius +
               ", x=" + x +
               ", y=" + y +
               ", color='" + color + '\'' +
               '}';
    }

    public Circle(){}

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public Circle(Circle target){
        super(target);
    }
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
