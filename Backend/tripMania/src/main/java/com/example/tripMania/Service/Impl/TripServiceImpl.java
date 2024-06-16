package com.example.tripMania.Service.Impl;

import com.example.tripMania.Dtos.RequestDtos.RequestDto;
import com.example.tripMania.Dtos.ResponseDto.ResponseDto;
import com.example.tripMania.Exception.NOT_FOUND_EXCEPTION;
import com.example.tripMania.Models.Trip;
import com.example.tripMania.Repository.TripRepository;
import com.example.tripMania.Service.TripService;
import com.example.tripMania.Transformation.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TripServiceImpl implements TripService {


    @Autowired
    private TripRepository tripRepository;

    @Override
    public String create(RequestDto requestDto) throws Exception {

        Trip trip = Transformer.convertEntity(requestDto);

        tripRepository.save(trip);

        return "successfully added";

    }

    @Override
    public String deleteTrip(String userId, Integer tripId) throws Exception {

        Optional<Trip> optionalTrip = tripRepository.findByTripIdAndUserId(tripId ,userId);

        if(optionalTrip.isEmpty()){
            throw new NOT_FOUND_EXCEPTION("this is invalid");
        }
        Trip trip = optionalTrip.get();

        tripRepository.delete(trip);
        return "deleted successfully";
    }

    @Override
    public ResponseDto updateTrip(RequestDto requestDto) throws Exception {
        return null;
    }
}
