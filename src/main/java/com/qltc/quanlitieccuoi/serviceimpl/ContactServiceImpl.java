package com.qltc.quanlitieccuoi.serviceimpl;

import com.qltc.quanlitieccuoi.domains.Contact;
import com.qltc.quanlitieccuoi.respositorys.ContactRespository;
import com.qltc.quanlitieccuoi.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    public ContactRespository contactRespository;

    @Override
    public Contact save(Contact contact) {
        return contactRespository.save(contact);
    }

    @Override
    public List<Contact> findAll(){ return contactRespository.findAll();}
}
