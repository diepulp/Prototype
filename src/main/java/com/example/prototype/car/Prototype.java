package com.example.prototype.car;

/**
 * Prototype
 */
public abstract class Prototype {
    private String name;
    private String owner;

    public Prototype(){}

    //Copy constructor
    public Prototype(Prototype target){
        if (target != null){
            this.name = target.name;
            this.owner = target.owner;
        }
    }

    public abstract Prototype copy(Prototype target);
}
