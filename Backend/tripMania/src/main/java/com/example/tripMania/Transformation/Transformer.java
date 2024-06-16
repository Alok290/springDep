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

    public static ResponseDto convertIntoResponseDto(Trip trip) {
        ResponseDto responseDto = ResponseDto.builder()
                .destinationName(trip.getDestinationName())
                .activities(trip.getActivities())
                .activitiesImages(trip.getActivitiesImages())
                .description(trip.getDescription())
                .endDate(trip.getEndDate())
                .timeTaken(trip.getTimeTaken())
                .extraCost(trip.getExtraCost())
                .foodCost(trip.getFoodCost())
                .foodInclude(trip.getFoodInclude())
                .hotelAdded(trip.getHotelAdded())
                .hotelCost(trip.getHotelCost())
                .travelCost(trip.getTravelCost())
                .travelingCost(trip.getTravelingCost())
                .startDate(trip.getStartDate())
                .totalCost(trip.getTotalCost())
                .visitingPlaces(trip.getVisitingPlaces())
                .visitingPlacesImgeList(trip.getVisitingPlaces())
                .tripType(trip.getTripType())
                .build();

        return responseDto;

    }

//    public static ResponseDto convertIntoResponse(Trip trip){
//        ResponseDto responseDto =ResponseDto.builder()
//                .
//                .build();
//
//        return responseDto;
//    }
}
