/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Jun-21
 *   Time: 1:30 AM
 *   File: Account.java
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Account implements AccountADT{
    private long accountNumber;
    private String accountTitle;
    private String dateCreated;
    private long balance;
    private long interestRate;
    private ArrayList<Transaction> allTransaction;

    public Account(){}

    public Account(long accountNumber, String accountTitle, String dateCreated, long balance, long interestRate) {
        this.accountNumber = accountNumber;
        this.accountTitle = accountTitle;
        this.dateCreated = dateCreated;
        this.balance = balance;
        this.interestRate = interestRate;
        this.allTransaction= new ArrayList<>();
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(long interestRate) {
        this.interestRate = interestRate;
    }

    public ArrayList<Transaction> getAllTransaction() {
        return allTransaction;
    }

    public void setAllTransaction(ArrayList<Transaction> allTransaction) {
        this.allTransaction = allTransaction;
    }

    @Override
    public void addTransaction(Transaction newTransaction){
        allTransaction.add(newTransaction);
        if(newTransaction.getTransactionType().equalsIgnoreCase("deposit")){
            this.balance+=newTransaction.getAmount();
        }
        else{
            this.balance-=newTransaction.getAmount();
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountTitle='" + accountTitle + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +'\n'+
                ", allTransaction=" + Arrays.toString(new ArrayList[]{allTransaction}) +
                '}';
    }
}

