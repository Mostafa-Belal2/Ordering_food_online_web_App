/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.spring;

/**
 *
 * @author Mostafa.Gazzar
 */
public class TestCityBean {

    private String nameAr;
    private String nameEn;

    public TestCityBean(String nameAr, String nameEn) {
        this.nameAr = nameAr;
        this.nameEn = nameEn;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

}
