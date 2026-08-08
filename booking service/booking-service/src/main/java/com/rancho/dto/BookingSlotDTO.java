package com.rancho.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingSlotDTO {
    private LocalDate startTime;
    private LocalDate endTime;
}
