package gr.aueb.cf.schoolapp.repository;

import gr.aueb.cf.schoolapp.model.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface PersonalInfoRepository extends JpaRepository<PersonalInfo, Long>,
        JpaSpecificationExecutor<PersonalInfo> {
    Optional<PersonalInfo> findByAmka(String amka);
    Optional<PersonalInfo> findByIdentityNumber(String identityNumber);
}
