package com.eliehome.officeInformation.service;

import com.eliehome.officeInformation.entity.Office;
import com.eliehome.officeInformation.error.OfficeNotFoundException;

import java.util.List;

public interface OfficeService {
   public Office saveOffice(Office office);

  public List<Office> fetchOfficeList();


    public Office fetchOfficeById(Long office_id) throws OfficeNotFoundException;

   public void deleteOfficeById(Long office_id);

   public Office updateOffice(Office office, Long office_id);

   public Office fetchOfficeByManager(String manager);

}
