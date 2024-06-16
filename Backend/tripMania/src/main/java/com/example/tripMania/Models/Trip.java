package com.example.tripMania.Models;


import com.example.tripMania.Enum.Activities;
import com.example.tripMania.Enum.TripType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tripId;


    @Column(nullable = false)
    private String userId;  // to create or list  a trip
    @Column(nullable = false)
    private String destinationName;
    @Column(nullable = false)
    private List<String> visitingPlaces; //list of place to visit

    @Column(nullable = false)
    private List<String> visitingPlacesImgeList; // images

    @Column(nullable = false)
    private String description; //details of trip

    @Column(nullable = false)
    private Double totalCost;

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private String endDate;

    @Column(nullable = false)
    private String timeTaken; //total time taken on trip

    @Enumerated(value = EnumType.STRING)
    private TripType tripType;  //type of trip you want

    @Enumerated(value = EnumType.STRING)
    private List<Activities> activities;
    private List<String> activitiesImages;

    private Boolean hotelAdded;

    private Double hotelCost;

    private Boolean foodInclude;
    private Double foodCost;

    private Boolean travelingCost;
    private Double travelCost;

    private Double extraCost;

    private Integer noOfPeople;

}
