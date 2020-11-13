/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De7;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author winan
 */
public class Manager {

    static ArrayList<ThiSinhKA> listTSKA = new ArrayList<>();

    static ArrayList<ThiSinhKC> listTSKC = new ArrayList<>();

    static public void menu() {
        System.out.println("1. Nhập thông tin thí sinh");
        System.out.println("2. In danh sách sinh viên trúng tuyển");
        System.out.println("3. Thoát");
        System.out.print("Chọn: ");
    }

    static public boolean Check(float a, float b, float c) {
        if (a + b + c > 20) {
            return true;
        } else {
            return false;
        }
    }

    static public void Nhap_DS() {
        System.out.print("Nhập vào số thí sinh: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Chọn khối thí sinh nhập thông tin: ");
            System.out.println("1. Khối A");
            System.out.println("2. Khối C");
            System.out.print("Chọn: ");
            int c = new Scanner(System.in).nextInt();
            switch (c) {
                case 1:
                    ThiSinhKA tska = new ThiSinhKA();
                    tska.Nhap();
                    listTSKA.add(tska);
                    break;
                case 2:
                    ThiSinhKC tskc = new ThiSinhKC();
                    tskc.Nhap();
                    listTSKC.add(tskc);
                    break;
            }
        }
    }

    static public void Show() {
        if (!listTSKA.isEmpty()) {
            System.out.println("Thí sinh trúng tuyển khối A là:");
            for (int i = 0; i < listTSKA.size(); i++) {
                if (Check(listTSKA.get(i).getDT(), listTSKA.get(i).getDH(), listTSKA.get(i).getDL())) {
                    System.out.println(listTSKA.get(i).toString());
                }
            }
        }
        if (!listTSKC.isEmpty()) {
            System.out.println("Thí sinh trúng tuyển khối C là:");
            for (int i = 0; i < listTSKC.size(); i++) {
                if (Check(listTSKC.get(i).getDD(), listTSKC.get(i).getDV(), listTSKC.get(i).getDS())) {
                    System.out.println(listTSKC.get(i).toString());
                }
            }
        }
        else System.out.println("Nhập vào thông tin các thí sinh!");
        System.out.println("");
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            int c = new Scanner(System.in).nextInt();
            switch (c) {
                case 1:
                    Nhap_DS();
                    break;
                case 2:
                    Show();
                    break;
                case 3:
                    exit(0);

            }
        }
    }
}
