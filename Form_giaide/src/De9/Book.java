/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De9;

/**
 *
 * @author winan
 */
public class Book {
    private String autors,title,category;
    private int ID;

    public Book(String autors, String title, String category, int ID) {
        this.autors = autors;
        this.title = title;
        this.category = category;
        this.ID = ID;
    }

    public Book() {
    }

    public String getAutors() {
        return autors;
    }

    public void setAutors(String autors) {
        this.autors = autors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "ID: " + ID +  " |\tAutors: " + autors + " |\tTitle: " + title + " |\tCategory: " + category + "\n";
    }
    
}
