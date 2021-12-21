package com.qltc.quanlitieccuoi.services;

import com.qltc.quanlitieccuoi.domains.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {
    Contact save(Contact contact);

    List<Contact> findAll();
}