package com.example.tripMania.Service;

import com.example.tripMania.Dtos.RequestDtos.RequestDto;
import com.example.tripMania.Dtos.ResponseDto.ResponseDto;

public interface TripService {
    String create(RequestDto requestDto)throws Exception;

    String deleteTrip(String userId, Integer tripId) throws Exception;

    ResponseDto updateTrip(RequestDto requestDto) throws Exception;
}
