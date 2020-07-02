/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.spring.bll;

import java.util.List;
import net.seniorsteps.senior.common.bean.CityBean;
import net.seniorsteps.senior.common.bean.ProductBean;
import net.seniorsteps.senior.spring.bll.manager.LookupsManager;
import net.seniorsteps.senior.spring.bll.manager.MenuManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Senior Steps
 */
@Service
public class SeniorBLGateway {

    @Autowired
    private MenuManager menuManager;

    @Autowired
    private LookupsManager lookupsManager;

    public List<CityBean> findCities() {
        return lookupsManager.findCities();
    }

    public CityBean addCity(CityBean cityBean) {
        return lookupsManager.addCity(cityBean);
    }

    public ProductBean addProduct(ProductBean product) {
        return menuManager.addProduct(product);
    }

    public CityBean getCity(Integer id) {
        return lookupsManager.getCity(id);
    }

    // <editor-fold defaultstate="collapsed" desc="GETTERS & SETTERS">
    public MenuManager getMenuManager() {
        return menuManager;
    }

    public void setMenuManager(MenuManager menuManager) {
        this.menuManager = menuManager;
    }

    public LookupsManager getLookupsManager() {
        return lookupsManager;
    }

    public void setLookupsManager(LookupsManager lookupsManager) {
        this.lookupsManager = lookupsManager;
    }
    // </editor-fold>
}
