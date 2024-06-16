package com.example.tripMania.Controller;

import com.example.tripMania.Dtos.RequestDtos.RequestDto;
import com.example.tripMania.Service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// RestController annotation is used to define a controller and to indicate that the return value of the methods should be bound to the web response body.
@RestController
// RequestMapping annotation is used to map web requests onto specific handler classes or handler methods.
@RequestMapping("/trip")
public class TripController {

    // Autowired annotation is used to auto-wire bean on the setter method, constructor or a field.
    @Autowired
    private TripService tripService;

    // PostMapping annotation maps HTTP POST requests onto specific handler methods.
    @PostMapping("/createTrip")
    // ResponseEntity represents an HTTP response, including headers, body, and status.
    public ResponseEntity createTrip(@RequestBody RequestDto requestDto) throws Exception {
        try {
            // Calls the create method from tripService and returns the response.
            String responseDto = tripService.create(requestDto);
            // Returns a new ResponseEntity object with the given body and status code.
            return new ResponseEntity(responseDto, HttpStatus.CREATED);
        } catch (Exception e) {
            // In case of exceptions, returns a new ResponseEntity with the exception message and CONFLICT status code.
            return new ResponseEntity(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    // DeleteMapping annotation maps HTTP DELETE requests onto specific handler methods.
    @DeleteMapping("/deleteTrip")
    public ResponseEntity deleteTrip(@RequestParam String userId, @RequestParam Integer tripId) throws Exception {
        try {
            // Calls the deleteTrip method from tripService and returns the response.
            return new ResponseEntity(tripService.deleteTrip(userId, tripId), HttpStatus.OK);
        } catch (Exception e) {
            // In case of exceptions, returns a new ResponseEntity with the exception message and CONFLICT status code.
            return new ResponseEntity(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    // PutMapping annotation maps HTTP PUT requests onto specific handler methods.
    @PutMapping("/updateTrip")
    public ResponseEntity updateTrip(@RequestBody RequestDto requestDto) throws Exception {
        try {
            // Calls the updateTrip method from tripService and returns the response.
            return new ResponseEntity(tripService.updateTrip(requestDto), HttpStatus.OK);
        } catch (Exception e) {
            // In case of exceptions, returns a new ResponseEntity with the exception message and CONFLICT status code.
            return new ResponseEntity(e.getMessage(), HttpStatus.CONFLICT);
        }
    }
}
