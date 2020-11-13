/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De3_1;

/**
 *
 * @author winan
 */
public class SinhVien {
    private String MSV,HT;
    private float DHP,DQT, DTB;

    public SinhVien(String MSV, String HT, float DHP, float DQT, float DTB) {
        this.MSV = MSV;
        this.HT = HT;
        this.DHP = DHP;
        this.DQT = DQT;
        this.DTB = DTB;
    }

    public SinhVien() {
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

    public float getDHP() {
        return DHP;
    }

    public void setDHP(float DHP) {
        this.DHP = DQT;
    }

    public float getDQT() {
        return DQT;
    }

    public void setDQT(float DQT) {
        this.DQT = DQT;
    }

    public float getDTB() {
        return Tinh_DTB();
    }

    public void setDTB(float DTB) {
        this.DTB = Tinh_DTB();
    }
    
    public float Tinh_DTB(){
        DTB = (float) (DQT*0.3 + DHP*0.7);
        return DTB;
    }
    
    @Override
    public String toString() {
        return "MSV: "+MSV+"| Ho va ten: "+HT + "| Điểm học phần: "+DHP+"| Điểm quá trình: "+DQT;
    }
      
}
