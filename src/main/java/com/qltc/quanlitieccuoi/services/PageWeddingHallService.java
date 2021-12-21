package com.qltc.quanlitieccuoi.services;

import com.qltc.quanlitieccuoi.domains.WeddingHall;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface PageWeddingHallService {
    Page<WeddingHall> findAll(Pageable pageable);

    Page<WeddingHall> search(String keySearch,Pageable pageable);
}
