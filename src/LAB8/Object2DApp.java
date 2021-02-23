package LAB8;

import javafx.scene.shape.Circle;

import java.util.ArrayList;

public class Object2DApp {
    public static void main(String[] args) {
        //Circle
         Cricle c1 = new Cricle(10.0);
        c1.calArea();
        System.out.println(c1.getArea());

        //Rectangle
        Rectangle r1 =  new Rectangle(5.0,5.0);
        r1.calArea();

        //Triangle
        Triangle T1 = new Triangle(10,5.0);
        T1.calArea();
        System.out.println(T1.getArea());

        ArrayList<Object2D> myObject = new ArrayList<Object2D>();
        myObject.add(c1);
        myObject.add(r1);
        myObject.add(T1);



    }//main
}//class
