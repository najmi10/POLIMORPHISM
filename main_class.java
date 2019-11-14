/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat_02;

/**
 *
 * @author ica
 */
public class main_class {
    public static void main(String[] args) {
        Line g = new Line(20,40,60,80);
        System.out.println(g.getLenght());
        System.out.println(g.isGreater(g, g));
        System.out.println(g.isLess(g, g));
        System.out.println(g.isEqual(g, g));
    }
}
