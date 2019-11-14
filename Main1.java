/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author ica
 */
public class Main1 {
    public static void main(String[] args) {
        Rect tayo1 = new Rect(1,1,4,4);
        Rect tayo2 = new Rect(2,3,5,6);
        Rect c = tayo1.union(tayo2);
        Rect a = tayo1.intersection(tayo2);
        
        if(c.isInside(tayo2.x1,tayo2.y1))
            System.out.println("(" + tayo2.x1+"," + tayo2.y1+") is Inside the union");
        System.out.println(tayo1 + "union" + tayo2+"=" +c);
        System.out.println(tayo1 + "intersect" + tayo2 + "=" + a);
    }
}
