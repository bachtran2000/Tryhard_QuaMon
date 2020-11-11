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
public class Student extends Person{
    private String MSV, email, DTK;

    public Student(String MSV, String email, String DTK, String HT, String NS, String DC, String GT) {
        super(HT, NS, DC, GT);
        this.MSV = MSV;
        this.email = email;
        this.DTK = DTK;
    }

    public Student() {
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDTK() {
        return DTK;
    }

    public void setDTK(String DTK) {
        this.DTK = DTK;
    }

    @Override
    public String toString() {
        return super.toString()+ "$" + MSV + "$" + email + "$" + DTK + "\n"; 
    } 
}
