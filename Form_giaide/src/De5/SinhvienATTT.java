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
public class SinhvienATTT extends Sinhvien{
    private float HP;

    public SinhvienATTT() {
    }

    public SinhvienATTT(float HP, String MSV, String HT, String NS, String GT, String DTB) {
        super(MSV, HT, NS, GT, DTB);
        this.HP = HP;
    }

    public float getHP() {
        return HP;
    }

    public void setHP(float HP) {
        this.HP = HP;
    }

    @Override
    public String toString() {
        return super.toString()+"\t|\tHọc phí: "+HP+"\n"; 
    }
}
