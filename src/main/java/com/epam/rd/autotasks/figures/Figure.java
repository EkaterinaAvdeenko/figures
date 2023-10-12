package com.epam.rd.autotasks.figures;


abstract class Figure{
    public abstract double area();//определение площади

    public abstract String pointsToString();

    public String toString() {

        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }

    public abstract Point leftmostPoint();
}
