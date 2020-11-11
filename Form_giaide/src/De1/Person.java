/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools $ Templates
 * and open the template in the editor.
 */
package De1;

/**
 *
 * @author winan
 */
public class Person {
    private String HT, NS, DC, GT;

    public Person(String HT, String NS, String DC, String GT) {
        this.HT = HT;
        this.NS = NS;
        this.DC = DC;
        this.GT = GT;
    }

    public Person() {
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

    @Override
    public String toString() {
        return HT+"$"+NS+"$"+DC+"$"+GT;
    }
    
}
