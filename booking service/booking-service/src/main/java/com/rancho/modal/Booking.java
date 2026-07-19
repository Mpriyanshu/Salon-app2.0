package com.rancho.modal;

import com.rancho.domain.BookingStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long salonId;

    private Long CustomerId;

    private LocalDateTime StartTime;

    private  LocalDateTime endTime;

    @ElementCollection
    private Set<Long> ServiceIds;

    private BookingStatus status=BookingStatus.PENDING;

    private int totalServices;







}
