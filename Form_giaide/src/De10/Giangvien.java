/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De10;

/**
 *
 * @author winan
 */
public class Giangvien {
    private String HT,MGV,DC,GT,Khoa;

    public Giangvien() {
    }

    public Giangvien(String HT, String MGV, String DC, String GT, String Khoa) {
        this.HT = HT;
        this.MGV = MGV;
        this.DC = DC;
        this.GT = GT;
        this.Khoa = Khoa;
    }

    public String getHT() {
        return HT;
    }

    public void setHT(String HT) {
        this.HT = HT;
    }

    public String getMGV() {
        return MGV;
    }

    public void setMGV(String MGV) {
        this.MGV = MGV;
    }

    public String getDC() {
        return DC;
    }

    public void setDC(String DC) {
        this.DC = DC;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    @Override
    public String toString() {
        return "MGV: " + MGV +" |\tHT: " + HT +  " |\t  DC:" + DC + " |\t GT: " + GT + " |\tKhoa: " + Khoa + "\n";
    }
    
}
