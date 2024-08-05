package userdefinedexeceptionex;

import multithreadingsynchro.InsufficientBalanceException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UseAccount {
    public static void main(String[] args) {
        Account act = new Account(1,"Ram",5000);
       String flag ="No";
       Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter amt to withdraw:");
            double amt = sc.nextDouble();
            try {
                act.withdraw(amt);
            }
            catch (InsufficientBalanceException e) {
             //   System.out.println(e.getMessage());
                System.out.println(e);
                System.out.println("you can no longer continue..");
                break;
            }
            System.out.println("do u wish to continue (Y/N):");
            flag = sc.next();
        }while(flag.toUpperCase().charAt(0)=='Y');
    }
}
