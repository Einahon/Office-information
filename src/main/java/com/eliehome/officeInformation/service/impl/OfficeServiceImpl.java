package com.eliehome.officeInformation.service.impl;

import com.eliehome.officeInformation.entity.Office;
import com.eliehome.officeInformation.error.OfficeNotFoundException;
import com.eliehome.officeInformation.repository.OfficeRepository;
import com.eliehome.officeInformation.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class OfficeServiceImpl implements OfficeService {
    @Autowired
    private OfficeRepository officeRepository;

    @Override
    public Office saveOffice(Office office) {
        return null;
    }

    @Override
    public List<Office> fetchOfficeList() {
        return null;
    }

    @Override
    public Office fetchOfficeById(Long office_id) throws OfficeNotFoundException {
        return null;
    }

    @Override
    public void deleteOfficeById(Long office_id) {

    }

    @Override
    public Office updateOffice(Office office, Long office_id) {
        Office office1 = officeRepository.findById(office_id).get();
        if(Objects.nonNull(office1.getCity()) &&
        !"".equalsIgnoreCase(office1.getCity())){
            office1.setCity(office1.getCity());
        }
        if(Objects.nonNull(office.getAddress()) &&
                !"".equalsIgnoreCase(office.getAddress())){
            office1.setAddress(office.getAddress());
        }
        if(Objects.nonNull(office.getManager()) &&
                !"".equalsIgnoreCase(office.getManager())){
            office1.setManager(office.getManager());
        }
        if(Objects.nonNull(office.getState()) &&
                !"".equalsIgnoreCase(office.getState())){
            office1.setState(office.getState());
        }
        return officeRepository.save(office1);
    }

    @Override
    public Office fetchOfficeByManager(String manager) {
        return officeRepository.findByManagerIgnoreCase(manager);
    }
}
