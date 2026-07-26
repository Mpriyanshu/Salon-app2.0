package com.rancho.controller;

import com.rancho.dto.BookingRequest;
import com.rancho.dto.SalonDTO;
import com.rancho.dto.UserDTO;
import com.rancho.modal.Booking;
import com.rancho.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    public ResponseEntity<Booking> createBooking(
            @RequestParam Long salonId,
            @RequestBody BookingRequest bookingRequest
            ){

        UserDTO user=new UserDTO();
        user.setId(1L);

        SalonDTO salon=new SalonDTO();
        salon.setId(salonId);

        return null;


    }

}
