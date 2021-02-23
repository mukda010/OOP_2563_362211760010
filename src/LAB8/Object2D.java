package LAB8;

public abstract class Object2D {
    //attributes
    private String b_color;
    private double area;

    //abstract
    abstract public void calArea();

    //
    public String getB_color(){
        return b_color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
