package com.rancho.modal;

import lombok.Data;

import java.util.List;

@Data
public class SalonReport {
    private Long salonId;
    private String salonName;
    private int totalEarnings;
    private Integer totalBookings;
    private Integer cancelledBookings;
    private Double totalRefund;


}
