
package ejercicios3;

public class Circle extends GeometricShape {
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea(){
        double Area;
        Area=(Math.PI*radius)*(Math.PI*radius);   
        return Area;
    }
    public double getPerimeter(){
        double Perimeter;
        Perimeter=Math.PI*(radius+radius);
        return Perimeter;
    }
    
    
}
