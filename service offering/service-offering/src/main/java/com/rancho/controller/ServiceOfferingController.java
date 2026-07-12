package com.rancho.controller;

import com.rancho.modal.ServiceOffering;
import com.rancho.service.ServiceOfferingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/service-offering")
public class ServiceOfferingController {

    private ServiceOfferingService serviceOfferingService;

    @GetMapping("/salon/{}salonId")
    public ResponseEntity<Set<ServiceOffering>> getServiceBySalonId(@PathVariable Long salonId,
                                                                    @RequestParam(required = false) Long categoryId){
        Set<ServiceOffering> serviceOfferings=serviceOfferingService.getAllServiceBySalonId(salonId, categoryId);
        return ResponseEntity.ok(serviceOfferings);

    }

}
