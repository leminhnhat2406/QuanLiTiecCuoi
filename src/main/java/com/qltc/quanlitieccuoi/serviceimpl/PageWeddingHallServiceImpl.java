package com.qltc.quanlitieccuoi.serviceimpl;

import com.qltc.quanlitieccuoi.domains.WeddingHall;
import com.qltc.quanlitieccuoi.respositorys.PageWeddingHallRespository;
import com.qltc.quanlitieccuoi.services.PageWeddingHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PageWeddingHallServiceImpl implements PageWeddingHallService {

    @Autowired
    PageWeddingHallRespository pageWeddingHallRespository;

    @Override
    public Page<WeddingHall> findAll(Pageable pageable) {
        return pageWeddingHallRespository.getStatus(pageable);
    }

    @Override
    public Page<WeddingHall> search(String keySearch, Pageable pageable) {
        return pageWeddingHallRespository.searchAndPagine(keySearch,pageable);
    }
}
