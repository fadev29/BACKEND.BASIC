package day3.InnerClass;

public class BankAccount {
    private double saldo;

    public  BankAccount(double saldo){this.saldo = saldo;}


    public class Transaction{
        private double total;

        public  Transaction(double total){this.total = total;}

        public void  hitungTotal(){
            saldo += total;
            System.out.println("Transaksi sukses, saldo saat ini : " + saldo);
        }
    }

    public static void main(String[] args) {
        // masukin saldo dengan nilai awal seribu
       BankAccount account = new BankAccount(10000);
       // bikin object transaksi dari inner class dan lakukan transaksi gope
       BankAccount.Transaction transaction = account.new Transaction(500);
       // panggil method nya
       transaction.hitungTotal();
    }
}
