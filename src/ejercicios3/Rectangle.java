
package ejercicios3;

public class Rectangle extends GeometricShape {
    double width;
    double height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        double Area;
        Area=width*height;
        return Area;
    }
    public double getPerimeter(){
        double Perimeter;
        Perimeter=(width+height)+(width+height);
        return Perimeter;
    }
    
}
