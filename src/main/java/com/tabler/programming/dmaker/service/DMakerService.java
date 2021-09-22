package com.tabler.programming.dmaker.service;

import com.tabler.programming.dmaker.entity.Developer;
import com.tabler.programming.dmaker.repository.DeveloperRepository;
import com.tabler.programming.dmaker.type.DeveloperLevel;
import com.tabler.programming.dmaker.type.DeveloperSkillType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

@Service
@RequiredArgsConstructor
public class DMakerService {
    private final DeveloperRepository developerRepository;

    // DB라고 생각하면됨
    private final EntityManager em;
    // ACID
    // Atomic
    // Consistency
    // Isolation
    // Durability
    @Transactional
    public void createDeveloper(){
        Developer developer = Developer.builder()
                .developerLevel(DeveloperLevel.JUNIOR)
                .developerSkillType(DeveloperSkillType.FRONT_END)
                .experienceYears(2)
                .name("Olaf")
                .age(5)
                .build();

        developerRepository.save(developer);
    }
}
