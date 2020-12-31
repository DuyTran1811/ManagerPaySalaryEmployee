package BT;

import java.util.ArrayList;
import java.util.Scanner;

public class Tets {
    public static void main(String[] args) {
        Methodss methodss = new Methodss();
        var list = new ArrayList<CBGV>();
        var input = new Scanner(System.in);
        var choice = 0;
        do {
            System.out.println("1: Them Nhan Vien");
            System.out.println("2: Hien Thi Danh Sach Nhan vien");
            System.out.println("3: Hien Thi Danh Sach Nhan Vien Tren 8Tr");
            System.out.println("0: Thoat");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    list.add(methodss.ceart(input));
                    break;
                case 2:
                    methodss.disPlay(list);
                    break;
                case 3:
                    methodss.Cucalator8tr(list);
                    methodss.disPlay(list);
                    break;
            }
        } while (true);
    }
}
