package com.rancho.service.impl;

import com.rancho.dto.CategoryDTO;
import com.rancho.dto.SalonDTO;
import com.rancho.dto.ServiceDTO;
import com.rancho.modal.ServiceOffering;
import com.rancho.service.ServiceOfferingService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ServiceOfferingServiceImpl implements ServiceOfferingService {

    @Override
    public ServiceOffering createService(SalonDTO salonDTO, ServiceDTO serviceDTO, CategoryDTO CategoryDTO) {
        return null;
    }

    @Override
    public ServiceOffering updateOffering(Long serviceId, ServiceOffering service) {
        return null;
    }

    @Override
    public Set<ServiceOffering> getAllServiceBySalonId(Long salonId, Long catyegoryId) {
        return Set.of();
    }

    @Override
    public Set<ServiceOffering> getServicesById(Set<Long> ids) {
        return Set.of();
    }
}
