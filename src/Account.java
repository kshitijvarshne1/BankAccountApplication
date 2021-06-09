/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Jun-21
 *   Time: 1:30 AM
 *   File: Account.java
 */

import java.util.ArrayList;

public class Account implements AccountADT{
    private long accountNumber;
    private String accountTitle;
    private String dateCreated;
    private long balance;
    private long interestRate;
    private ArrayList<Transaction> allTransaction;

    public Account(long accountNumber, String accountTitle, String dateCreated, long balance, long interestRate) {
        this.accountNumber = accountNumber;
        this.accountTitle = accountTitle;
        this.dateCreated = dateCreated;
        this.balance = balance;
        this.interestRate = interestRate;
        this.allTransaction= new ArrayList<>();
    }

}

