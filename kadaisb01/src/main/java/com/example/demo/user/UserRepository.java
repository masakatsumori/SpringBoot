package com.example.demo.user;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Employees, Integer> {

    @Query(value = "select * from employees", nativeQuery = true)
    List<Employees> findAll();

    @Modifying
    @Transactional
    @Query(value = "update users set name = 'xxx' where name = ?1", nativeQuery =
    true)
    String Employees();

    // @Modifying
    // @Transactional
    // @Query(value = "INSERT INTO users satomi value ", nativeQuery = true)
    // int insertUser(String insertName);
}
