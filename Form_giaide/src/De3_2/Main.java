/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De3_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author winan
 */
public class Main {
    ArrayList<Nhanvien> dsnv = new ArrayList<>();
    public void ReadFile(){
        
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("nhanvien.dat");
            FileReader fr = new FileReader(f);
            //Bước 2: Đọc dữ liệu
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                Nhanvien st = new Nhanvien();
                String[] result = new String[10];
                result = line.split("\\$");
                st.setDC(result[2]);
                st.setGT(result[3]);
                st.setHSL(Float.parseFloat(result[5]));
                st.setHT(result[0]);
                st.setLCB(Float.parseFloat(result[7]));
                st.setNS(result[1]);
                st.setPB(result[4]);
                st.setTN(Float.parseFloat(result[6]));
                dsnv.add(st);
                
            }
            System.out.println(dsnv.toString());
            //Bước 3: Đóng luồng
            fr.close();
            br.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file: " + ex);
        }
    }
    
    public static void main(String[] args) {
        Nhanvien nv = new Nhanvien();
        Main mn = new Main();
        
        nv.Nhap_info();
        System.out.println(nv.toString());
        mn.ReadFile();
    }
}
