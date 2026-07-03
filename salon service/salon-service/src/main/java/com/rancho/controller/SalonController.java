package com.rancho.controller;

import com.rancho.mapper.SalonMapper;
import com.rancho.modal.Salon;
import com.rancho.payload.dto.SalonDTO;
import com.rancho.payload.dto.UserDTO;
import com.rancho.service.SalonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/salons")
@RequiredArgsConstructor
public class SalonController {

    private  final SalonService salonService;


    @PostMapping
    public ResponseEntity<SalonDTO> createSalon(@RequestBody SalonDTO salonDTO){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        Salon salon=salonService.createSalon(salonDTO, userDTO);
        SalonDTO salonDTO1= SalonMapper.mapToDTO(salon);
        return ResponseEntity.ok(salonDTO);
    }

    @PatchMapping
    public ResponseEntity<SalonDTO> updateSalon(@RequestBody SalonDTO salonDTO){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        Salon salon=salonService.createSalon(salonDTO, userDTO);
        SalonDTO salonDTO1= SalonMapper.mapToDTO(salon);
        return ResponseEntity.ok(salonDTO);
    }
}
