/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg7;

/**
 *
 * @author philipfynn
 */
import java.util.*;

public class Area {

    int length;
    int breadth;

    public Area(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getArea() {
        return length*breadth;

    }
}
    
 class Ans{
     public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         int l,b;
         
         System.out.println("Enter the length");
         l = s.nextInt();
         System.out.println("");
         
         System.out.println("Enter the breadth");
         b = s.nextInt();
         
         Area a = new Area(l,b);
         System.out.println("Area: "+a.getArea());
     
     }
 
 }


