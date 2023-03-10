public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
      bankAccount.setMoneyAmount(1000); // передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
       bankAccount.withdrawAll(); // вызовите метод вывода средств
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount;

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public void withdrawAll() {
        System.out.println(" Со счёта снято " + moneyAmount);
        moneyAmount = 0;
    }

    public String toString() {
        return "BankAccount{" +
                "moneyAmount=" + moneyAmount +
                '}';
    }

    // допишите код методов
    // используйте параметр newMoneyAmount для установки нового значения
}