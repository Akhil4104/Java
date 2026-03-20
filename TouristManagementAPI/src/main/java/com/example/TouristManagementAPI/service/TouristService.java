package com.example.TouristManagementAPI.service;

import com.example.TouristManagementAPI.entity.Tourist;
import com.example.TouristManagementAPI.exception.TouristNotFoundException;
import com.example.TouristManagementAPI.repository.ITouristRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TouristService implements ITouristService{
    @Autowired
    private ITouristRepo repo;

    @Override
    public String registerTourist(Tourist tourist) {
        Tourist tour=repo.save(tourist);
        return "Tourits Info Registered with id";
    }

    @Override
    public Tourist fetchTouristById(Integer id) throws TouristNotFoundException {
//        Optional<Tourist>optional=repo.findById(id);
//        if(optional.isPresent()){
//            return optional.get();
//        }
//        else{
//            throw new TouristNotFoundException("Tourist with given id not found");
//        }
        return repo.findById(id).orElseThrow(()->new TouristNotFoundException("Tourist with given id not found"));
    }

    @Override
    public List<Tourist> fetchAllTouristInfo() {
        return List.of();
    }

    @Override
    public String updateTheTouristInfo(Tourist tourist) {
        Optional<Tourist>optional=repo.findById(tourist.getId());
        if(optional.isPresent()){
//            Tourist tour=optional.get();
            repo.save(tourist);
            return "Updated";
        }
        else{
            throw new TouristNotFoundException("Tourist with given info not found with update");
        }
    }

    @Override
    public String updateTheTouristBudget(Integer id, Double budget) {
        Optional<Tourist>optional=repo.findById(id);
        if(optional.isPresent()){
            Tourist tourist=optional.get();
            tourist.setBudget(budget);
            repo.save(tourist);
            return "Updated";
        }
        else{
            throw new TouristNotFoundException("Tourist with given id not found");
        }
    }

    @Override
    public String deleteTouristInfoById(Integer id) {
        Optional<Tourist>optional=repo.findById(id);
        if(optional.isPresent()){
            repo.deleteById(id);
            return "Tourist record deleted with id "+id;
        }
        return "No Tourist found with given id to delete";
    }
}
