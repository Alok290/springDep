package com.example.tripMania.Transformation;

import com.example.tripMania.Dtos.RequestDtos.RequestDto;
import com.example.tripMania.Dtos.ResponseDto.ResponseDto;
import com.example.tripMania.Models.Trip;

public class Transformer {

    public static Trip convertEntity(RequestDto requestDto){

        Trip trip = Trip.builder()
                .destinationName(requestDto.getDestinationName())
                .activities(requestDto.getActivities())
                .activitiesImages(requestDto.getActivitiesImages())
                .description(requestDto.getDescription())
                .endDate(requestDto.getEndDate())
                .startDate(requestDto.getStartDate())
                .visitingPlaces(requestDto.getVisitingPlaces())
                .visitingPlacesImgeList(requestDto.getVisitingPlacesImgeList())
                .tripType(requestDto.getTripType())
                .userId(requestDto.getUserId())
                .timeTaken(requestDto.getTimeTaken())
                .totalCost(requestDto.getTotalCost())
                .build();

        return trip;
    }

//    public static ResponseDto convertIntoResponse(Trip trip){
//        ResponseDto responseDto =ResponseDto.builder()
//                .
//                .build();
//
//        return responseDto;
//    }
}
