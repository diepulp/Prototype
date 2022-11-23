package com.example.prototype.car;

public class Car extends Prototype{
    private String make;

    public Car(){
        super();
    }
    public Car(Car target) {
        super(target);
        this.make = target.make;

    }

    @Override
    public Prototype copy(Prototype target) {
        return new Car(this);
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Car)) return false;
        final Car other = (Car) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$make = this.getMake();
        final Object other$make = other.getMake();
        if (this$make == null ? other$make != null : !this$make.equals(other$make)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Car;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $make = this.getMake();
        result = result * PRIME + ($make == null ? 43 : $make.hashCode());
        return result;
    }

//    public String toString() {
//        return "Car(make=" + this.getMake() + ")";
//    }
}
