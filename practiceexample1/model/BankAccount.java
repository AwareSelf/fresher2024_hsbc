package practiceexample1.model;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Set;

public class BankAccount {


    int acctId;
    String acctName;
    LocalDate acctCreationDate;
    Set<Transaction> set;
}
