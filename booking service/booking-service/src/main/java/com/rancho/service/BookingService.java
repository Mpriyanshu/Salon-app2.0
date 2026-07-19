package com.rancho.service;

import com.rancho.dto.BookingRequest;
import com.rancho.dto.SalonDTO;
import com.rancho.dto.ServiceDTO;
import com.rancho.dto.UserDTO;
import com.rancho.modal.Booking;

import java.util.Set;

public interface BookingService {

     Booking createBooking(BookingRequest booking,
                           UserDTO ser,
                           SalonDTO salonDTO,
                           Set<ServiceDTO> serviceDTOSet);
}
