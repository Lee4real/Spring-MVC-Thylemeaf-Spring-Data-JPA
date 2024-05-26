package ma.enset.hospital.repositories;

import ma.enset.hospital.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

// The PatientRepository interface extends JpaRepository, which is a JPA specific extension of Repository.
// It contains methods for performing standard CRUD operations.
public interface PatientRepository extends JpaRepository<Patient,Long> {

    // The findByNomContains method is a derived query method.
    // It will return a Page of Patients whose 'nom' field contains the provided keyword.
    // The Pageable parameter is used to provide pagination information.
    Page<Patient> findByNomContains(String keyword, Pageable pageable);

    // The @Query annotation allows for the execution of custom SQL queries.
    // In this case, it's selecting Patients whose 'nom' field contains the provided keyword.
    // The @Param annotation is used to bind the method parameter to the query parameter.
    @Query("select p from Patient p  where p.nom like :x")
    Page<Patient> chercher(@Param("x") String keyword, Pageable pageable);
}