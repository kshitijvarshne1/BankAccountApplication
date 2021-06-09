/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Jun-21
 *   Time: 1:33 AM
 *   File: Transaction.java
 */

public class Transaction {
    private long transactionNumber;
    private String transactionDate;
    private String transactionType;
    private long amount;

    public Transaction(long transactionNumber, String transactionDate, String transactionType, long amount) {
        this.transactionNumber = transactionNumber;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.amount = amount;
    }
}

