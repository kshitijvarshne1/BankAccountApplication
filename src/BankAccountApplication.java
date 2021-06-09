/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Jun-21
 *   Time: 1:55 AM
 *   File: BankAccountApplication.java
 */

public class BankAccountApplication {
    public static void main(String[] args) {
        SavingAmount sa= new SavingAmount(514682,"Sam","10/06/2021",12548,2);
        sa.addTransaction(new Transaction(985644,"10/06/2021","deposit",50000));
        sa.addTransaction(new Transaction(578543,"11/06/2021","withdrawl",2015));
        System.out.println(sa.toString());

        CheckingAmount ca= new CheckingAmount(514683,"Joe","10/06/2021",56842,3);
        ca.addTransaction(new Transaction(985645,"10/06/2021","deposit",500));
        ca.addTransaction(new Transaction(578546,"11/06/2021","withdrawl",215));
        System.out.println(ca.toString());

    }
}
/*
if you face any problem then you can mail me any time kshitijvarshney92@gmail.com
* */

