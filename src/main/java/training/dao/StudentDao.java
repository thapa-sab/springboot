package training.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<StudentEntity, Integer>{

}
