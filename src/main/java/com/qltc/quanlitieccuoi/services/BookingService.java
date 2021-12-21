package com.qltc.quanlitieccuoi.services;

import com.qltc.quanlitieccuoi.domains.BookService;
import com.qltc.quanlitieccuoi.domains.Booking;

import java.util.List;

public interface BookingService {
    Booking save(Booking booking);

    List<Booking> check(int id);

    Booking findTop();

    void save(int idBooking ,int idService );

    Booking checkBookingExist(String dateHeld, int idWeddingHall,  int idShift);

    List<BookService> getBookSer();

    List<Booking> findAll();

    int delete(int id);

    List<Booking> findBookingById(int idUser);


}