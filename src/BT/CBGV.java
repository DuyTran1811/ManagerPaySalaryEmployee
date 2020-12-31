package BT;

import java.util.Date;

public class CBGV extends Personnel {
    private int salary;
    private int bonus;
    private int punish;

    public CBGV() {
    }

    public CBGV(int salary, int bonus, int punish) {
        this.salary = salary;
        this.bonus = bonus;
        this.punish = punish;
    }

    public CBGV(String fullName, Date dateOfBirth,
                String nativeVillage, int salary, int bonus, int punish) {
        super(fullName, dateOfBirth, nativeVillage);
        this.salary = salary;
        this.bonus = bonus;
        this.punish = punish;
    }

    public int getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public int getPunish() {
        return punish;
    }

    public int actual() {
        return salary = bonus - punish;
    }
}
