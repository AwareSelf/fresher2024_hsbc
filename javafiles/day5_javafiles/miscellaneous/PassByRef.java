package miscellaneous;

public class PassByRef {

    public static void main(String[] args) {
          int no=5,no1=10;
        //swap no and no1
          int[] arr = {no,no1};
          System.out.println("before swap func called:no:"
                  +arr[0]+",no1:"+arr[1]);
          swap(arr);
         System.out.println("after swap func:no"
                 +arr[0]+",no1:"+arr[1]);
    }


    static void swap(int[] arr) {

         int temp;
         temp = arr[0];
         arr[0]=arr[1];
         arr[1] = temp;
    }
}