package com.qltc.quanlitieccuoi.controllers;

import com.qltc.quanlitieccuoi.domains.BookService;
import com.qltc.quanlitieccuoi.domains.Booking;
import com.qltc.quanlitieccuoi.serviceimpl.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookingController {

    @Autowired
    BookingServiceImpl bookingService;


    @GetMapping(value = "/lich-su-dat-tiec")
    public ModelAndView getHistoryBooking(@RequestParam(name = "id") int id){
        ModelAndView mv = new ModelAndView("user/historybooking");
        List<Booking> list = bookingService.findBookingById(id);
        List<BookService> listB = bookingService.getBookSer();
        mv.addObject("list",list);
        mv.addObject("listB",listB);
        return mv;
    }
}
