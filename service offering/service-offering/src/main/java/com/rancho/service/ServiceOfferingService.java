package com.rancho.service;

import com.rancho.dto.CategoryDTO;
import com.rancho.dto.SalonDTO;
import com.rancho.dto.ServiceDTO;
import com.rancho.modal.ServiceOffering;

import java.util.List;
import java.util.Set;

public interface ServiceOfferingService {

    ServiceOffering createService(SalonDTO salonDTO,
                                  ServiceDTO serviceDTO,
                                  CategoryDTO CategoryDTO);

    ServiceOffering updateOffering(Long serviceId, ServiceOffering service);

    Set<ServiceOffering>  getAllServiceBySalonId(Long salonId,Long catyegoryId);

    Set<ServiceOffering> getServicesById(Set<Long> ids);
}
