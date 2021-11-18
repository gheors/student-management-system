package gheors.pack.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gheors.pack.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}