package com.rancho.service;

import com.rancho.dto.CategoryDTO;
import com.rancho.dto.SalonDTO;
import com.rancho.dto.ServiceDTO;
import com.rancho.modal.ServiceOffering;

public interface ServiceOfferingService {

    ServiceOffering createService(SalonDTO salonDTO,
                                  ServiceDTO serviceDTO,
                                  CategoryDTO CategoryDTO);
}
