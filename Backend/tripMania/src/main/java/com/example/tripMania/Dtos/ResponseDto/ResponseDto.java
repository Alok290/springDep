package com.example.tripMania.Dtos.ResponseDto;


import com.example.tripMania.Enum.Activities;
import com.example.tripMania.Enum.TripType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDto {




    private String destinationName;
    private List<String> visitingPlaces; //list of place to visit
    private List<String> visitingPlacesImgeList; // images
    private String description; //details of trip
    private Double totalCost;

    private Date startDate;
    private String endDate;
    private String timeTaken; //total time taken on trip

    private TripType tripType;  //type of trip you want

    private List<Activities> activities;
    private List<String> activitiesImages;

    private Boolean hotelAdded;

    private Double hotelCost;

    private Boolean foodInclude;
    private Double foodCost;

    private Boolean travelingCost;
    private Double travelCost;

    private Double extraCost;
}
