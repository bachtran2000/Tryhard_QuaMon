/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De3_1;

import java.util.ArrayList;

/**
 *
 * @author winan
 */
public class LopHoc {
    public ArrayList<SinhVien> dssv = new ArrayList<>();
    private int SSL;
    private String TL;

    public LopHoc(int SSL, String TL) {
        this.SSL = SSL;
        this.TL = TL;
    }

    public LopHoc() {
    }

    public ArrayList<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    public int getSSL() {
        return SSL;
    }

    public void setSSL(int SSL) {
        this.SSL = SSL;
    }

    public String getTL() {
        return TL;
    }

    public void setTL(String TL) {
        this.TL = TL;
    }
    
    
    
}
