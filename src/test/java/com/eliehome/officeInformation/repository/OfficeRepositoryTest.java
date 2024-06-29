package com.eliehome.officeInformation.repository;

import com.eliehome.officeInformation.entity.Office;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest

class OfficeRepositoryTest {
    @Autowired

    private OfficeRepository officeRepository;
    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Office office =
                Office.builder()
                        .manager("Dossou Joseph")
                        .address("03 Reinke Trail")
                        .state("OH")
                        .city("Cincinnati")
                        .build();

        entityManager.persist(office);
    }
    @Test
    public void whenFindById_thenReturnOffice(){
        Office office = officeRepository.findById(1L).get();
        assertEquals(office.getManager(), "Dossou Joseph");
    }

    private void assertEquals(String manager, String dossouJoseph) {
    }
}