/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl;

/**
 *
 * @author Admin
 */
public class JsonResult {

    private int cnt;
    private Daily[] list;
    private City city;
 

    public JsonResult() {
    }

    public JsonResult(int cnt, Daily[] list, City city) {
        this.cnt = cnt;
        this.list = list;
        this.city = city;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public Daily[] getList() {
        return list;
    }

    public void setList(Daily[] list) {
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

}
