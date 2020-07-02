/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.spring;

import net.seniorsteps.senior.common.bean.CityBean;
import net.seniorsteps.senior.spring.bll.SeniorBLGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mostafa.Gazzar
 */
@RestController
public class CityController {

    @Autowired
    private SeniorBLGateway seniorBLGateway;

    @GetMapping("/getCity")
    public CityBean getCity(@RequestParam(value = "id", defaultValue = "0") String id) {
//        return new TestCityBean("Hello", "Hello");
//        System.out.println("ID : " + id);
        return seniorBLGateway.getCity(Integer.parseInt(id));
    }

//    public SeniorBLGateway getSeniorBLGateway() {
//        return seniorBLGateway;
//    }
//
//    public void setSeniorBLGateway(SeniorBLGateway seniorBLGateway) {
//        this.seniorBLGateway = seniorBLGateway;
//    }
}
