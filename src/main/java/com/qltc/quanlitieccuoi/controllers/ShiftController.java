package com.qltc.quanlitieccuoi.controllers;

import com.qltc.quanlitieccuoi.serviceimpl.ShiftServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ShiftController {

    @Autowired
    ShiftServiceImpl shiftService;
}
