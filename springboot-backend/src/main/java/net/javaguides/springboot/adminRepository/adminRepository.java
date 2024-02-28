package net.javaguides.springboot.adminRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.adminModel.adminModel;



@Repository
public interface adminRepository extends JpaRepository<adminModel, Long> {

}