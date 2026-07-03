package com.rancho.controller;

import com.rancho.mapper.SalonMapper;
import com.rancho.modal.Salon;
import com.rancho.payload.dto.SalonDTO;
import com.rancho.payload.dto.UserDTO;
import com.rancho.service.SalonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salons")
@RequiredArgsConstructor
public class SalonController {

    private  final SalonService salonService;

    // http://localhost:5002/api/salons->  api for this method
    @PostMapping
    public ResponseEntity<SalonDTO> createSalon(@RequestBody SalonDTO salonDTO){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        Salon salon=salonService.createSalon(salonDTO, userDTO);
        SalonDTO salonDTO1= SalonMapper.mapToDTO(salon);
        return ResponseEntity.ok(salonDTO1);
    }
    // http://localhost:5002/api/salons/2->  api for this method
    @PatchMapping("/{id}")
    public ResponseEntity<SalonDTO> updateSalon(
            @PathVariable("id") Long salonId,
            @RequestBody SalonDTO salonDTO) throws Exception {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        Salon salon=salonService.updateSalon(salonDTO, userDTO, salonId);
        SalonDTO salonDTO1= SalonMapper.mapToDTO(salon);
        return ResponseEntity.ok(salonDTO1);
    }

    // http://localhost:5002/api/salons->  api for this method
    @GetMapping()
    public ResponseEntity<List<SalonDTO>> getSalon() throws Exception {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        List<Salon> salons=salonService.getAllSalons();

        List<SalonDTO> salonDTOS=salons.stream().map((salon) ->
                {
                    SalonDTO salonDTO=SalonMapper.mapToDTO(salon);
                    return salonDTO;
                }
                ).toList();
        return ResponseEntity.ok(salonDTOS);
    }

    // http://localhost:5002/api/salons/5->  api for this method
    @GetMapping("/{salonId}")
    public ResponseEntity<SalonDTO> getSalonById(
            @PathVariable Long salonId
    ) throws Exception {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);

        Salon salon=salonService.getSalonById(salonId);

        SalonDTO salonDTO=SalonMapper.mapToDTO(salon);

        return ResponseEntity.ok(salonDTO);

    }

    // http://localhost:5002/api/salons/search?city=mumbai->  api for this method
    @GetMapping("/search")
    public ResponseEntity<List<SalonDTO>> searchSalon(
            @RequestParam("city") String city
    ) throws Exception {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        List<Salon> salons=salonService.searchSalonByCity(city);

        List<SalonDTO> salonDTOS=salons.stream().map((salon) ->
                {
                    SalonDTO salonDTO=SalonMapper.mapToDTO(salon);
                    return salonDTO;
                }
        ).toList();
        return ResponseEntity.ok(salonDTOS);
    }

    @GetMapping("/owner")
    public ResponseEntity<SalonDTO> getSalonByOwnerId(
            @PathVariable Long salonId
    ) throws Exception {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);

        Salon salon=salonService.getSalonByOwnerId(userDTO.getId());

        SalonDTO salonDTO=SalonMapper.mapToDTO(salon);

        return ResponseEntity.ok(salonDTO);

    }
}
