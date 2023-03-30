package com.uob.splcache.repo;


import com.uob.splcache.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("mangerRepo")
public interface ManagerRepository extends JpaRepository<Manager, Long> {

}
