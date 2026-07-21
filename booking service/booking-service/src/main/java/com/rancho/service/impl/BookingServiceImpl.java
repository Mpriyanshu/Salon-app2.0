package com.rancho.service.impl;

import com.rancho.domain.BookingStatus;
import com.rancho.dto.BookingRequest;
import com.rancho.dto.SalonDTO;
import com.rancho.dto.ServiceDTO;
import com.rancho.dto.UserDTO;
import com.rancho.modal.Booking;
import com.rancho.modal.SalonReport;
import com.rancho.repository.BookingRepository;
import com.rancho.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Override
    public Booking createBooking(BookingRequest booking,
                                 UserDTO user,
                                 SalonDTO salon,
                                 Set<ServiceDTO> serviceDTOSet) {

        return null;
    }

    @Override
    public List<Booking> getBookingsByCustomer(Long customerId) {
        return List.of();
    }

    @Override
    public List<Booking> getBookingBySalon(Long salonId) {
        return List.of();
    }

    @Override
    public Booking getBooKingById(Long Id) {
        return null;
    }

    @Override
    public Booking UpdateBooking(Long bookingId, BookingStatus status) {
        return null;
    }

    @Override
    public List<Booking> getBookingsByDate(LocalDate date, Long salonId) {
        return List.of();
    }

    @Override
    public SalonReport getSalonReport(Long salonId) {
        return null;
    }
}
