package abstractex;

public abstract class Shape {
    private int side1,side2,side3,side4;
    private String shapeType;
    double radius;

    public Shape(int side1,String shapeType) {
        this.side1 = this.side2 = this.side3 =this.side4 = side1;
        this.shapeType = shapeType;
    }

    public Shape(int side1, int side2,String shapeType) {
        this.side1 = side1;
        this.side2 = side2;
        this.shapeType = shapeType;
    }

    public Shape(double radius)
    {
       this.radius = radius;
    }



    public Shape(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getSide4() {
        return side4;
    }

    public void setSide4(int side4) {
        this.side4 = side4;
    }

    public String getShapeType() {
        return shapeType;
    }

    public abstract int calcArea();


     public abstract int calcPerimeter();

}
