
package ejercicios3;


public class Square extends GeometricShape {
    double side;
    public Square (double side){
        this.side=side;
    }
    public double getArea(){
        double Area;
        Area=side*side;
        return Area;
    }
    public double getPerimeter(){
        double Perimeter;
        Perimeter=side*4;
        return Perimeter;
    }
    
}
