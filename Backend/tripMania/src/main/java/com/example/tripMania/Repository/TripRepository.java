package com.example.tripMania.Repository;


import com.example.tripMania.Models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TripRepository extends JpaRepository<Trip,Integer> {


    Optional<Trip> findByTripIdAndUserId(Integer tripId,String userId);


    List<Trip> findByUserId(String userId);





    @Query("SELECT p FROM Trip p WHERE p.totalCost BETWEEN :lowPrice AND :highPrice ORDER BY p.totalCost ASC")
    List<Trip> findTripByPriceRange(@Param("lowPrice") Double lowPrice, @Param("highPrice") Double highPrice);
}
