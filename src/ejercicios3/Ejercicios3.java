/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;
import ejercicios3.*;
/**
 *
 * @author turupawn
 */

public class Ejercicios3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);
        
        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(100,200);

        Square s1 = new Square(10);
        Square s2 = new Square(20);
        
        System.out.print("inheritance: ");
        if(c1 instanceof GeometricShape
                && c2 instanceof GeometricShape
                && r1 instanceof GeometricShape
                && r2 instanceof GeometricShape
                && s1 instanceof GeometricShape
                && s2 instanceof GeometricShape
                )
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");            
        }
        
        System.out.print("circle area: ");
        if(c1.getArea() == 986.9604401089358
                && c2.getArea() == 3947.8417604357433)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");            
        }
        
        System.out.print("circle perimeter: ");
        if(c1.getPerimeter() == 62.83185307179586
                && c2.getPerimeter() == 125.66370614359172)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");            
        }
        
        System.out.print("rectangle area: ");
        if(r1.getArea() == 200.0
                && r2.getArea() == 20000.0)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");            
        }
        
        System.out.print("rectangle perimeter: ");
        if(r1.getPerimeter()== 60.0
                && r2.getPerimeter() == 600.0)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");            
        }
        
        System.out.print("square area: ");
        if(s1.getArea() == 100
                && s2.getArea() == 400.0)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");            
        }
        
        System.out.print("square perimeter: ");
        if(s1.getPerimeter()== 40
                && s2.getPerimeter() == 80)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");            
        }
    }
    
}
