/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Order;

/**
 *
 * @author Admin
 */
//make this extensive
public class Order {
    
    private int orderID;
    private String item;
    private int sourceid;
    //link to customer
    private String orderOwner;
    private String ownerName;
    //make it extensive in terms of delivery service
    private String status="Not Started";
    private String location;
    private String dagent="Unassigned";
    private int quantity;
    private double toLat;
    private double toLong;

    public double getToLat() {
        return toLat;
    }

    public void setToLat(double toLat) {
        this.toLat = toLat;
    }

    public double getToLong() {
        return toLong;
    }

    public void setToLong(double toLong) {
        this.toLong = toLong;
    }

    
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    
    public String getDagent() {
        return dagent;
    }

    public void setDagent(String dagent) {
        this.dagent = dagent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getSourceid() {
        return sourceid;
    }

    public void setSourceid(int sourceid) {
        this.sourceid = sourceid;
    }

    public String getOrderOwner() {
        return orderOwner;
    }

    public void setOrderOwner(String orderOwner) {
        this.orderOwner = orderOwner;
    }
    @Override
    public String toString(){
        return item;
    }
    
}
