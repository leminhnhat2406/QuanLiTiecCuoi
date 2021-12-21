package com.qltc.quanlitieccuoi.controllers.admin;

import com.qltc.quanlitieccuoi.domains.Contact;
import com.qltc.quanlitieccuoi.serviceimpl.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminContactController {
    @Autowired
    ContactServiceImpl contactService ;

    @GetMapping(value = "/lien-he")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("admin/contact");

        List<Contact> list = contactService.findAll();

        System.out.println(list);
        mv.addObject("list",list);
        return mv;
    }
}
