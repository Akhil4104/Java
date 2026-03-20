package com.example.TouristManagementAPI.service;

import com.example.TouristManagementAPI.entity.Tourist;
import com.example.TouristManagementAPI.exception.TouristNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ITouristService {
    String registerTourist(Tourist tourist);
    Tourist fetchTouristById(Integer id) throws TouristNotFoundException;
    List<Tourist>fetchAllTouristInfo();
    String updateTheTouristInfo(Tourist tourist);
    String updateTheTouristBudget(Integer id,Double budget);
    String deleteTouristInfoById(Integer id);
}
