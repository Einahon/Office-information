package com.eliehome.officeInformation.repository;

import com.eliehome.officeInformation.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Long> {


}
