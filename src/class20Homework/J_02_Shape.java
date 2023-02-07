package class20Homework;

public class J_02_Shape {
    /*
    Task 2:
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */

    double radius;
    double pi= 3.14;
    J_02_Shape(double radius){

        this.radius= radius;
    }
}


class Circle extends J_02_Shape {
    double area;

    Circle(double radius){

        super(radius);
    }
    double areaOfCircle(){
        this.area= pi*radius*radius;
        return area;
    }

}

class Main{
    public static void main(String[] args) {

        Circle circle= new Circle(5);
        System.out.println("Area od Circle: "+circle.areaOfCircle());

    }
}