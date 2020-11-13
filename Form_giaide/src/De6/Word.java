/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De6;

/**
 *
 * @author winan
 */
public class Word {
    private String En,Vn;
    private int Id;

    public Word() {
    }

    public Word(String En, String Vn, int Id) {
        this.En = En;
        this.Vn = Vn;
        this.Id = Id;
    }

    public String getEn() {
        return En;
    }

    public void setEn(String En) {
        this.En = En;
    }

    public String getVn() {
        return Vn;
    }

    public void setVn(String Vn) {
        this.Vn = Vn;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

   
    public void show() {
        System.out.println("Id: " + Id +"\t|\tEn: " + En + " \t|\tVn: " + Vn);
    }
}
