package miscellaneous;

import classesobjects.Emp;

public class TwoDArray {
    public static void main(String[] args) {

        Emp[][] arr = new Emp[2][]; //this is 2d array of two 1-d emp array refereces.

        arr[0] = new Emp[2]; //first 1-d array size of 2 emp references
        arr[0][0] = new Emp(1,"Ram",4000);
        arr[0][1] = new Emp(2,"Shyam",5000);

        arr[1] = new Emp[3]; //2nd 1d array size is of 3 emp references
        arr[1][0] = new Emp(3,"sita",4000);



    }
}
