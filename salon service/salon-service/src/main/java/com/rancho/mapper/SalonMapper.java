package com.rancho.mapper;

import com.rancho.modal.Salon;
import com.rancho.payload.dto.SalonDTO;

public class SalonMapper {

    public static SalonDTO mapToDTO(Salon salon) {
        SalonDTO salonDTO = new SalonDTO();
        salonDTO.setId(salon.getId());

        salonDTO.setName(salon.getName());
        salonDTO.setCity(salon.getCity());
        salonDTO.setAddress(salon.getAddress());
        salonDTO.setImages(salon.getImages());
        salonDTO.setCloseTime(salon.getCloseTime());
        salonDTO.setOpenTime(salon.getOpenTime());
        salonDTO.setPhoneNumber(salon.getPhoneNumber());
        salonDTO.setEmail(salon.getEmail());
        salonDTO.setOwnerId(salon.getOwnerId());
        return salonDTO;
    }
}
