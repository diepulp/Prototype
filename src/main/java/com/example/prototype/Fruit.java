package com.example.prototype;


import com.example.prototype.car.Prototype;

/**
 * @author :Timothy Fair
 * @version 1.0
 * Simulates the time an expensive instantiation might take by waiting to grow fruit seeds.
 */
public class Fruit extends Prototype {
    private String name;
    private String locale;


    public Fruit() {
        super();
    }

    public Fruit(Fruit target) {
        super(target);
        this.name = target.name;
        this.locale = target.locale;
    }


    /**
     * Constructor that simulates a long wait time for growing fruit.
     *
     * @param name   name of the fruit
     * @param locale fruit's local habitat
     */
    public Fruit(String name, String locale) {
        growFruit(name);
        this.name = name;
        this.locale = locale;

    }


    @Override
    public Prototype copy(Prototype target) {
        return new Fruit(this);
    }

    /**
     * simulates the growing of fruit by waiting.
     * @param fruit name of fruit to pass in.
     */
    private void growFruit(String fruit) {
        System.out.println("Planting our " + fruit + " seeds...");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Watering our " + fruit + " seeds...");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The seeds are taking their time to grow, please wait...");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Wonderful! We have a beautiful " + fruit + " plant in the garden now.");


    }


    @Override
    public String toString() {
        return "Fruit{" +
               "name='" + name + '\'' +
               ", locale='" + locale + '\'' +
               '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}