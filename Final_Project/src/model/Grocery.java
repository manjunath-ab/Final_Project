/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Grocery {
    private String name;
    private int stallid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStallid() {
        return stallid;
    }

    public void setStallid(int stallid) {
        this.stallid = stallid;
    }
    @Override
    public String toString(){
        return name;
    }

}
