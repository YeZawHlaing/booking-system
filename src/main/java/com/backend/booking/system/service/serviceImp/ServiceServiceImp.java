package com.backend.booking.system.service.serviceImp;

import com.backend.booking.system.model.Services;
import com.backend.booking.system.repository.ServiceRepository;
import com.backend.booking.system.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceServiceImp implements ServiceService {
    @Autowired
    private final ServiceRepository serviceRepository;

    @Override
    public Services createService(Services services) {
        return  serviceRepository.save(services);

    }

    @Override
    public List<Services> getAllService() {
        return serviceRepository.findAll();
    }

    @Override
    public Services updateService(Services services, Long id) {
        Services is_exist=serviceRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        is_exist.setService_Id(services.getService_Id());

        serviceRepository.save(is_exist);

        return is_exist;
    }

    @Override
    public Services deleteService(Long id) {
        Services is_exist=serviceRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        serviceRepository.deleteById(id);
        return is_exist;
    }
}
