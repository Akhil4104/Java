package com.example.TouristManagementAPI.repository;

import com.example.TouristManagementAPI.entity.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface ITouristRepo extends JpaRepository<Tourist,Integer> {
}
