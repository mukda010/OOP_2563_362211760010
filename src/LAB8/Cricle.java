package LAB8;

public class Cricle extends Object2D {
    private  static final double PI=3.141;
    //
    private double radius;
    //
    public Cricle(double radius){
        this.radius= radius;
    }


    @Override
    public void calArea() {
        //
        double area = PI*radius*radius;
        super.setArea(area);
    }

}
