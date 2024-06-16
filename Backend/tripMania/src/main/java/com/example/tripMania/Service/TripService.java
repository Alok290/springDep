package com.example.tripMania.Service;

import com.example.tripMania.Dtos.RequestDtos.RequestDto;
import com.example.tripMania.Dtos.ResponseDto.ResponseDto;

import java.util.List;

public interface TripService {
    String create(RequestDto requestDto)throws Exception;

    String deleteTrip(String userId, Integer tripId) throws Exception;

    ResponseDto updateTrip(RequestDto requestDto) throws Exception;

    List<ResponseDto> findTipsUnderBudget(Double budget) throws Exception;

    List<ResponseDto> getTripList(String userId)throws Exception;
}
