package com.rancho.service;

import com.rancho.dto.CategoryDTO;
import com.rancho.dto.SalonDTO;
import com.rancho.dto.ServiceDTO;
import com.rancho.modal.ServiceOffering;

import java.util.List;
import java.util.Set;

public interface ServiceOfferingService {

    ServiceOffering createService(SalonDTO salonDto,
                                  ServiceDTO serviceDTO,
                                  CategoryDTO categoryDTO);

    ServiceOffering updateOffering(Long serviceId, ServiceOffering service) throws Exception;

    Set<ServiceOffering>  getAllServiceBySalonId(Long salonId,Long categoryId);

    Set<ServiceOffering> getServicesById(Set<Long> ids);

    ServiceOffering getServiceById(Long id) throws Exception;

    Set<ServiceOffering> getServicesByIds(Set<Long> ids);

}
