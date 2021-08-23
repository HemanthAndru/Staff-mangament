package com.hemanth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hemanth.entites.staff;

public interface StaffDaoRepositry extends JpaRepository<staff, Integer> {

}
