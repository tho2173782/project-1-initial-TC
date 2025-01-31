package com.csc205.project1;

/*
Design & implement a class called Point that represents a location in the Cartesian plane.

 */
public class Point {
    private double x;
    private double y;

    //construcotr
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Set point Cords
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Shift point along x-axis.
        public void shiftX(double n) {
        this.x += n;
    }

    //Shift point along 7-axis.
    public void shiftY(double n) {
        this.y += n;
    }

    //Calaculate distance between another point
    public double distance(Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - x, 2) + Math.pow(p2.getY() - this.y, 2));
    }

    //Rotate point around the origin
    public void rotate(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        this.x = newX;
        this.y = newY;

    }
}
