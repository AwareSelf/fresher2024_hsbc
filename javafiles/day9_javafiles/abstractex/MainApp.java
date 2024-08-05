package abstractex;

public class MainApp {

    public static void main(String[] args) {
        Shape s = new Square(5);
        int a = s.calcArea();
        int pm = s.calcPerimeter();
        System.out.println("Area of square with side:"+s.getSide1()+" is:"+a);
        System.out.println("Perimeter of square with side:"+s.getSide1()+" is:"+pm);

        meth(s);
        meth(new Square(3));

        meth(new Rectangle(3,5));

    }

    public static void meth(Shape s)
    {
        int a = s.calcArea();
        int pm = s.calcPerimeter();
        System.out.println("Type of Shape:"+s.getShapeType());
        System.out.println("Are:"+a);
        System.out.println("Perimeter:"+pm);
    }
}
