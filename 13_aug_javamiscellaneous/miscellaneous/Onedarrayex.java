package miscellaneous;

import classesobjects.Emp;

public class Onedarrayex {

    public static void main(String[] args) {
        int[] arr;//java-style
       // int arr[];//c-style

        arr = new int[4];

        for(int i=0;i<arr.length;i++)
        {
             arr[i] = i;
        }

        for(int x:arr) //for-each loope - to iterate the array or collection
        {
            System.out.println(x);
        }


        int[] arr1 = {5,2,4,6,3};
        for(int i:arr1)
        {
            System.out.println(i);
        }

        String[] arr2 = {"nisha","lata","geeta","meeta"};
        for(String i:arr2)
        {
            System.out.println(i);
        }

        Emp[] emparr = new Emp[3];
        emparr[0] = new Emp(1,"Ram",5000);
        emparr[1] = new Emp(2,"Radha",6000);

        for(Emp x:emparr)
        {
            System.out.println(x);
            if(x!=null)
            {
                System.out.println("ann sal:"+x.computeAnnSal());
            }
        }

    }

}
