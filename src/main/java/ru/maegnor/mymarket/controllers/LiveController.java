package ru.maegnor.mymarket.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiveController {

    @GetMapping("/isalive")
    public ResponseEntity<?> isALive (){
        return new ResponseEntity<String>("imalive", HttpStatus.OK);
    }
}
