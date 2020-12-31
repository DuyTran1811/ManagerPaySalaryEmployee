package BT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Methodss {

    public CBGV ceart(Scanner input) {
        System.out.println("Nhap Ten");
        var name = input.nextLine();
        System.out.println("Nhap Tuoi");
        Date dateOfBirth = null;
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            dateOfBirth = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Que Quan");
        var nativeVillage = input.nextLine();
        System.out.println("Nhap Luong");
        int salary = Integer.parseInt(input.nextLine());
        System.out.println("Luong Thuong");
        int bonus = Integer.parseInt(input.nextLine());
        System.out.println("Tien Phat");
        int punish = Integer.parseInt(input.nextLine());
        return new CBGV(name, dateOfBirth, nativeVillage, salary, bonus, punish);
    }

    public void disPlay(ArrayList<CBGV> list) {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        System.out.printf("%-13s%-13s%-13s%-13s%-13s%-13s\n",
                "Ho Ten", "Tuoi", "Que Quan", "Luong", "Tien Thuong", "Phat");
        for (var index : list) {
            System.out.printf("%-13s%-13s%-13s%-13s%-13s%-13s\n",
                    index.getFullName(), dateFormat.format(index.getDateOfBirth()), index.getNativeVillage(),
                    index.getSalary(), index.getBonus(), index.getPunish());
        }
    }

    public ArrayList<CBGV> Cucalator8tr(ArrayList<CBGV> list) {
        ArrayList<CBGV> listsOf = new ArrayList<>();
        for (var index : list) {
            if (index.actual() >= 8000000) listsOf.add(index);
        }
        return listsOf;
    }
}
