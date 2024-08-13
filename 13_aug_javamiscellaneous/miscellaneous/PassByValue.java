package miscellaneous;

public class PassByValue {

    public static void main(String[] args)
    {
        int no = 5;
        incrby5(no);
        System.out.println(no);
     }

    static void incrby5(int no)
    {
        no = no + 5;
    }

}


