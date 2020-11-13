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
public class SinhvienMM extends  Sinhvien{
    private float Luong;
    private String DV;

    public SinhvienMM() {
    }

    public SinhvienMM(float Luong, String DV, String MSV, String HT, String NS, String GT, String DTB) {
        super(MSV, HT, NS, GT, DTB);
        this.Luong = Luong;
        this.DV = DV;
    }

    public float getLuong() {
        return Luong;
    }

    public void setLuong(float Luong) {
        this.Luong = Luong;
    }

    public String getDV() {
        return DV;
    }

    public void setDV(String DV) {
        this.DV = DV;
    }

    @Override
    public String toString() {
        return super.toString()+"\t|\t Lương: "+Luong+"\t|\t Đơn vị: "+DV+"\n"; //To change body of generated methods, choose Tools | Templates.
    }
}
