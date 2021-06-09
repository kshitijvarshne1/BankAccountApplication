/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Jun-21
 *   Time: 1:32 AM
 *   File: SavingAmount.java
 */

public class SavingAmount extends Account {
    public SavingAmount(long accountNumber, String accountTitle, String dateCreated, long balance, long interestRate) {
        super(accountNumber, accountTitle, dateCreated, balance, interestRate);
        if(balance<10000){
            System.out.println("Please add more than 10000 rs and makes sure its minimum balance balance requirement 10000");
        }

    }

    @Override
    public void addTransaction(Transaction newTransaction) {
        if(super.getAllTransaction().size()>50){
            System.out.println("Monthly transaction limit exceeded");
        }
        else{
            super.addTransaction(newTransaction);
        }

    }
}

