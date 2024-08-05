package abstractex;

public class Square extends Shape {


    public Square(int side1) {
        super(side1,"Square");
    }

    @Override
    public int calcArea() {
        return this.getSide1()*this.getSide1();

    }

    @Override
    public int calcPerimeter() {
        return this.getSide1()*4;
    }
}
