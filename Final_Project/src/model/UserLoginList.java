/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class UserLoginList {
    private ArrayList<UserLogin>  userLoginList;

    public ArrayList<UserLogin> getUserLoginList() {
        return userLoginList;
    }

    public void setUserLoginList(ArrayList<UserLogin> userLoginList) {
        this.userLoginList = userLoginList;
    }

    public UserLoginList() {
        this.userLoginList =new ArrayList<>();
    }
}
