package functionalprogramming;

public class LambdaFunctionEx  {

    public static void main(String[] args) {
        Addable ref = new Myclass();
        int result =  ref.sum(5,5);
        System.out.println(result);

        meth(new Myclass(),10,10);

        //implement Addable Functional interface using Lambda Function

        Addable intf = (int a,int b)-> {
                                System.out.println("lambda impl of Addable interface- " +
                                        "overrding abstract method");
                                  return a+b;
                               };

        int r = intf.sum(12,12);
        System.out.println(r);

        //you can shorten above lambda implmentation as below
        Addable intf1 = (a,b)-> a+b;
        r = intf1.sum(12,13);
        System.out.println(r);

        r = meth((a,b)->a+b,9,8);
        System.out.println(r);

    }

    public static int meth(Addable a,int n1,int n2)
    {
        return a.sum(n1,n2);
    }

}

class Myclass implements Addable
{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
