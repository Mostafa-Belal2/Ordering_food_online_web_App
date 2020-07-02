/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.spring.web.app;

import java.util.List;
import net.seniorsteps.senior.common.bean.CityBean;
import net.seniorsteps.senior.spring.bll.SeniorBLGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mostafa.Gazzar
 */
@Controller
@RequestMapping(value = "/cities/")
public class CityContoller {

    @Autowired
    private SeniorBLGateway seniorBLGateway;

    @RequestMapping(value = "all")
    public ModelAndView all(@RequestParam(name = "s", required = false) String status) {
//        String status = request.getParameter("s");

        List<CityBean> findCities = seniorBLGateway.findlistcities();
        String message = "";
        if (status != null) {
            if ("true".equals(status)) {
                message = "Added Successfully";
            } else {
                message = "Error in Adding";
            }
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cities/all");
        modelAndView.addObject("msg", message);
        modelAndView.addObject("findCities", findCities);
        return modelAndView;
    }

    @RequestMapping(value = "deleteCity")
    public ModelAndView delete(@RequestParam(name = "id", required = false) String id) {
        int idd = Integer.parseInt(id);
        CityBean cityBean = new CityBean();
        cityBean.setId(idd);
        seniorBLGateway.deleteCity(cityBean);
        List<CityBean> findCities = seniorBLGateway.findlistcities();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cities/all");
//        modelAndView.addObject("msg", message);
        modelAndView.addObject("findCities", findCities);
        return modelAndView;
    }

    @RequestMapping(value = "addcityform")
    public ModelAndView addcityform() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cities/cityform");
//        modelAndView.addObject("msg", message);
//        modelAndView.addObject("findCities", findCities);
        return modelAndView;
    }

    @RequestMapping(value = "addcity")
    public ModelAndView addcity(@RequestParam(name = "nameAr") String nameAr, @RequestParam(name = "nameEn") String nameEn) {

        boolean added = false;
        String message = "";

        try {

            CityBean cityBean = new CityBean();
            cityBean.setNameAr(nameAr);
            cityBean.setNameEn(nameEn);
            seniorBLGateway.addCity(cityBean);
            added = true;
            message = "Added Successfully";
        } catch (Exception ex) {

            added = false;
            message = "Error in Adding";
        }

        List<CityBean> findCities = seniorBLGateway.findlistcities();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cities/all");
        modelAndView.addObject("msg", added);
        modelAndView.addObject("findCities", findCities);
        return modelAndView;
    }

    @RequestMapping(value = "editcityform")
    public ModelAndView editcityform(@RequestParam(name = "id") Integer id) {
        ModelAndView modelAndView = new ModelAndView();
//        int id=Integer.parseInt(request.getParameter("id"));
        CityBean cityBean = new CityBean();

        cityBean.setId(id);

        CityBean findCityById = seniorBLGateway.findCityByid(cityBean);

        modelAndView.setViewName("cities/editcityform");
        modelAndView.addObject("citybeanid", cityBean.getId());
        modelAndView.addObject("findCityById", findCityById);

        return modelAndView;
    }

    // <editor-fold defaultstate="collapsed" desc="GETTERS & SETTERS">
    public SeniorBLGateway getSeniorBLGateway() {
        return seniorBLGateway;
    }

    public void setSeniorBLGateway(SeniorBLGateway seniorBLGateway) {
        this.seniorBLGateway = seniorBLGateway;
    }
    // </editor-fold>

}
