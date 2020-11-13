/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De8;

/**
 *
 * @author winan
 */
public class Number {
    private float max,min,value;

    public Number() {
    }

    public Number(float max, float min, float value) {
        this.max = max;
        this.min = min;
        this.value = value;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
    public void show(){
        System.out.println("Min: "+min+"\t|\tValue: "+value+"\t|\tMax: "+max);
    }

    @Override
    public String toString() {
        return "Min: "+min+"\t|\tValue: "+value+"\t|\tMax: "+max+"\n";
    }
}
