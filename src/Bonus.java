public class Bonus {
    public static void main(String[] args) {
        // Размер пополнения счёта
        long topup = 1500;
        long bonus;
       if (topup > 1000) {
           bonus = topup/100;
       }
       else {
           bonus = 0;
       }
long balance = 100;
        balance = balance + topup + bonus;
        System.out.println("Balance = " + balance);
        System.out.println("Bonus = " + bonus);
        }
}

