/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat_04;

/**
 *
 * @author ica
 */
public class Rectangle extends Shape {
    private int lenght;
    private int width;
    //Konstruktor
    public Rectangle(String color , int lenght, int width){
        super(color);
        this.lenght = lenght;
        this.width = width;
    }
    @Override
    public String toString(){
        return "Rectangle[lenght=" + lenght +",width=" + width + "," + super.toString() + "]";
    }
    //Override the inherited getArea() to provide the proper implementation
    @Override
    public double getArea(){
        return lenght*width;
    }
    
}
