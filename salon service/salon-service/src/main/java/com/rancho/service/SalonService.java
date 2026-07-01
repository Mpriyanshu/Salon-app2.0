package com.rancho.service;

import com.rancho.modal.Salon;
import com.rancho.payload.dto.SalonDTO;
import com.rancho.payload.dto.UserDTO;

public interface SalonService {
    Salon createSalon(SalonDTO salon, UserDTO user);
}
