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
        return officeRepository.save(office);
    }

    @Override
    public List<Office> fetchOfficeList() {

        return officeRepository.findAll();
    }

    @Override
    public Office fetchOfficeById(Long office_id) throws OfficeNotFoundException {
        Optional<Office> office = officeRepository.findById(office_id);
        if(!office.isPresent()){
            throw new OfficeNotFoundException("Office not available by ID "+ office_id);
        }
        return officeRepository.findById(office_id).get();
    }

    @Override
    public void deleteOfficeById(Long office_id) throws OfficeNotFoundException {

        if(!officeRepository.existsById(office_id)){
            throw new OfficeNotFoundException("Office does not exist by id "+ office_id);
        }
        officeRepository.deleteById(office_id);


    }

    @Override
    public Office updateOffice(Office office, Long office_id) throws OfficeNotFoundException {
        Office office1 = officeRepository.findById(office_id).orElseThrow(() ->new OfficeNotFoundException("Office not Available"));


        if(Objects.nonNull(office.getCity()) &&
        !"".equalsIgnoreCase(office.getCity())){
            office1.setCity(office.getCity());
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

}
