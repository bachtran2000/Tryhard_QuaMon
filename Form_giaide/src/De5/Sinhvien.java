/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De5;

/**
 *
 * @author winan
 */
public class Sinhvien {
    private String MSV,HT,NS,GT,DTB;

    public Sinhvien() {
    }

    public Sinhvien(String MSV, String HT, String NS, String GT, String DTB) {
        this.MSV = MSV;
        this.HT = HT;
        this.NS = NS;
        this.GT = GT;
        this.DTB = DTB;
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getHT() {
        return HT;
    }

    public void setHT(String HT) {
        this.HT = HT;
    }

    public String getNS() {
        return NS;
    }

    public void setNS(String NS) {
        this.NS = NS;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getDTB() {
        return DTB;
    }

    public void setDTB(String DTB) {
        this.DTB = DTB;
    }

    @Override
    public String toString() {
        return "MSV: " + MSV + "\t|\tHT: "+ HT + "\t|\tNS: "+ NS + "\t|\tGT: "+ GT + "\t|\tDTB: "+ DTB;
    }
    
}
