package com.spring.spring_boot_data_rest.dao;



import com.spring.spring_boot_data_rest.entity.HeroesDota;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HeroesDotaRepository extends JpaRepository<HeroesDota, Integer> {
}


