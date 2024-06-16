package com.example.tripMania.Repository;


import com.example.tripMania.Models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TripRepository extends JpaRepository<Trip,Integer> {


    Optional<Trip> findByTripIdAndUserId(Integer tripId,String userId);

}
