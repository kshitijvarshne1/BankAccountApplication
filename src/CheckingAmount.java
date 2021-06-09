/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Jun-21
 *   Time: 1:31 AM
 *   File: CheckingAmount.java
 */

public class CheckingAmount extends Account{
    public CheckingAmount(long accountNumber, String accountTitle, String dateCreated, long balance, long interestRate) {
        super(accountNumber, accountTitle, dateCreated, balance, interestRate);
    }

    @Override
    public void addTransaction(Transaction newTransaction) {
        super.addTransaction(newTransaction);
    }
}

