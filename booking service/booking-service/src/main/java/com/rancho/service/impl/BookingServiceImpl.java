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
import java.time.LocalDateTime;
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
        int totalDuration = serviceDTOSet.stream()
                            .mapToInt(ServiceDTO::getDuration)
                            .sum();

        LocalDateTime bookingStartTime=booking.getStartTime();
        LocalDateTime bookingEndTime=bookingStartTime.plusMinutes(totalDuration);
        return null;
    }

    public  Boolean isTimeSlotAvailable(SalonDTO salonDTO,
                                        LocalDateTime bookingStartTime,
                                        LocalDateTime bookingEndTime) throws Exception {
            List<Booking> existingBookings=getBookingBySalon(salonDTO.getId());
        LocalDateTime salonOpenTime= salonDTO.getOpenTime().atDate(bookingStartTime.toLocalDate());
        LocalDateTime salonCloseTime= salonDTO.getCloseTime().atDate(bookingStartTime.toLocalDate());
        if(bookingStartTime.isBefore(salonOpenTime) || bookingEndTime.isAfter(salonCloseTime)){
            throw new Exception("Booking time must be within salon's working hours");
        }

        for(Booking existingBooking: existingBookings){
            LocalDateTime existingBookingStartTime=existingBooking.getStartTime();
            LocalDateTime existingBookingEndTime=existingBooking.getEndTime();

            if(bookingStartTime.isBefore(existingBookingEndTime)
                    && bookingEndTime.isAfter(existingBookingStartTime)){

                throw new Exception("")

            }
        }

        return  true;
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
