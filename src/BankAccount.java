import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BankAccount implements Comparable<BankAccount>,Measurable {
    public float balance;
    public float rate;
    public BankAccount(float balance,float rate){
        this.balance=balance;
        this.rate=rate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", rate=" + rate +
                '}';
    }

    public static void main(String [] args) {

        BankAccount[] arr = new BankAccount[3];
        BankAccount account1 = new BankAccount(100,1);
        BankAccount account2 = new BankAccount(300,1);
        BankAccount account3 = new BankAccount(200,1);
        arr[0]=account1;
        arr[1]=account2;
        arr[2]=account3;
        System.out.println("compareTo"+account1.compareTo(arr[1]));
        Arrays.sort(arr);
        System.out.println("arr["+Arrays.toString(arr)+"]");
        System.out.println("average["+Data.average(arr)+"]");
    }

    @Override
    public int compareTo(BankAccount o) {
        return (int)(this.balance-o.balance);
    }

    @Override
    public float getMeasure() {
        return this.balance;
    }
}