package com.qltc.quanlitieccuoi.controllers;

import com.qltc.quanlitieccuoi.domains.Service;
import com.qltc.quanlitieccuoi.serviceimpl.ServiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServiceController {

    @Autowired
    ServiceServiceImpl serviceService;

    @GetMapping(value = "chi-tiet-dich-vu")
    public ModelAndView getDetaiService(@RequestParam(value = "id") int id){
        ModelAndView mv = new ModelAndView("user/detailservice");
        Service service = serviceService.findById(id);
        mv.addObject("service",service);
        return mv;
    }
}
