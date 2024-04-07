package Task2;

public class ATM {
    int note20;
    int note50;
    int note100;

    public ATM(int note20, int note50, int note100) {
        this.note20 = note20;
        this.note50 = note50;
        this.note100 = note100;
    }

    void addMoney(int note20, int note50, int note100) {
        this.note20 += note20;
        this.note50 += note50;
        this.note100 += note100;
    }


    boolean WithdrawnMoney(int amount) {
        int amount100 = Math.min(amount / 100, this.note100);
        int amount50 = Math.min((amount - amount100 * 100) / 50, this.note50);
        int amount20 = Math.min((amount - amount100 * 100 - amount50 * 50) / 20, this.note20);

        if (amount == amount100 * 100 + amount50 * 50 + amount20 * 20) {
            this.note100 -= amount100;
            this.note50 -= amount50;
            this.note20 -= amount20;
            System.out.println("Выдано: " + amount100 + " купюр по 100, " + amount50 + " купюр по 50 " + amount20 + " купюр по 20.");
            return true;
        }
        System.out.println("Невыозможно выдать сумму!!!");
        return false;
    }


}
