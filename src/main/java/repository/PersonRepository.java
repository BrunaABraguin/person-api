package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import univesp.oop.personapi.entity.Person;

public interface PersonRepository extends JpaRepository <Person, Long>{
}
