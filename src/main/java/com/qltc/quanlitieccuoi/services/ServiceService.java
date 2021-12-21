package com.qltc.quanlitieccuoi.services;

import com.qltc.quanlitieccuoi.domains.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceService {
    List<Service> getService();

    Service findById(int id);

    Page<Service> findAll(Pageable pageable);

    List<Service> getAll();

    Service findServiceById(int id);

    Service save(Service service);

    List<Service> getSer();
    int update(String name, int cost,String description, String image, int id);

    int delete(int id);
}
