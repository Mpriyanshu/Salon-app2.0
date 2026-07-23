package com.rancho.service;

import com.rancho.domain.BookingStatus;
import com.rancho.dto.BookingRequest;
import com.rancho.dto.SalonDTO;
import com.rancho.dto.ServiceDTO;
import com.rancho.dto.UserDTO;
import com.rancho.modal.Booking;
import com.rancho.modal.SalonReport;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface BookingService {

     Booking createBooking(BookingRequest booking,
                           UserDTO ser,
                           SalonDTO salonDTO,
                           Set<ServiceDTO> serviceDTOSet) throws Exception;

     List<Booking> getBookingsByCustomer(Long customerId);
     List<Booking> getBookingBySalon(Long salonId);
     Booking getBooKingById(Long Id) throws Exception;
     Booking UpdateBooking(Long bookingId, BookingStatus status);
     List<Booking> getBookingsByDate(LocalDate date, Long salonId);
     SalonReport getSalonReport(Long salonId);
}
