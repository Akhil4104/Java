package com.example.TouristManagementAPI.controller;

import com.example.TouristManagementAPI.entity.Tourist;
import com.example.TouristManagementAPI.exception.TouristNotFoundException;
import com.example.TouristManagementAPI.service.ITouristService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TouristRestApi {
    @Autowired
    private ITouristService service;

    @PostMapping("/regTourist")
    public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist){
        String response=service.registerTourist(tourist);
        return new ResponseEntity<String>(response, HttpStatus.CREATED);
    }

    @GetMapping("/getTourist/{id}")
    public ResponseEntity<?>getTourist(@PathVariable("id") Integer id){
        Tourist tourist=service.fetchTouristById(id);
        return new ResponseEntity<Tourist>(tourist,HttpStatus.OK);
    }
    @GetMapping("/getAllTourist")
    public ResponseEntity<?>getAllTourist(@PathVariable("id") Integer id){
        List<Tourist> tourists=service.fetchAllTouristInfo();
        return new ResponseEntity<List>(tourists,HttpStatus.OK);
    }
    @PutMapping("/updatetourist")
    public ResponseEntity<?>updateTheTourist(@RequestBody Tourist tourist){
        String status=service.updateTheTouristInfo(tourist);
        return new ResponseEntity<String>(status,HttpStatus.OK);
    }

    @PatchMapping("/updatetouristbudget/{id}/{budget}")
    public ResponseEntity<String>updateTheTourist(@PathVariable("id")Integer id,@PathVariable("budget")Double budget){
        String status=service.updateTheTouristBudget(id,budget);
        return new ResponseEntity<String>(status,HttpStatus.OK);
    }

    @DeleteMapping("/deletetourist/{id}/{budget}")
    public ResponseEntity<String>updateTheTouristBudget(@PathVariable("id")Integer id,@PathVariable("budget")Double budget){
        String status=service.updateTheTouristBudget(id,budget);
        return new ResponseEntity<String>(status,HttpStatus.OK);

    }
}
