package com.example.tripMania.Controller;


import com.example.tripMania.Dtos.ResponseDto.ResponseDto;
import com.example.tripMania.Service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/find-trip")
public class FindTripController {



    @Autowired
    private TripService tripService;


    @GetMapping("/budget/{budget}")
    public ResponseEntity findTripByBudget(@PathVariable Double budget) throws Exception{

        try{
            List<ResponseDto> tripList = tripService.findTipsUnderBudget(budget);
            return new ResponseEntity(tripList, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }



    //location

    // acc to trip type



}
