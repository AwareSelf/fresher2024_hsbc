package layeredexample.application;

import layeredexample.viewlayer.OrderView;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        String yesno = "No";
        OrderView ov = new OrderView();
        Scanner sc = new Scanner(System.in);
          do {
              ov.inputOrderDetials();
              ov.showAllOrders();
              System.out.println("Do you wish to continue:(Y/N)");
              yesno = sc.next();
          }while(yesno.toUpperCase().charAt(0)=='Y');



    }

}
