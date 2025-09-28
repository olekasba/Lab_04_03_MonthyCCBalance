//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double balance = 5000;
        double interestRate = 0.17;
        double interest1 = 0;
        double interest2 = 0;


        System.out.println("The balance is " + balance + " with an interest rate of " + interestRate);
        interest1 = balance * interestRate;
        interest2 = (balance + interest1) * interestRate;
        System.out.println("Interest after one month is " + interest1);
        System.out.println("Interest after two months is " + interest2);
    }
}