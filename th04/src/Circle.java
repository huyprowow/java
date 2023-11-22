public class Circle {
    private double radius=1.0;
    private String color="red";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString()
    {
        return "Circle @ "+color+ " radius= "+radius;
    }
    public  double getArea()
    {
        return Math.PI*(radius*radius);
    }
}