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

    public long getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(long transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "transactionNumber=" + transactionNumber +
                ", transactionDate='" + transactionDate + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                '}';
    }
}

