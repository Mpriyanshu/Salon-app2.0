package com.rancho.dto;

import com.rancho.domain.BookingStatus;
import jakarta.persistence.ElementCollection;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDTO {

    private Long id;

    private Long salonId;

    private Long CustomerId;

    private LocalDateTime StartTime;

    private  LocalDateTime endTime;

    private Set<Long> ServiceIds;

    private BookingStatus status=BookingStatus.PENDING;


}
