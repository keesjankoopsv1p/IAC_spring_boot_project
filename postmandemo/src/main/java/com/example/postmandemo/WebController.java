package com.example.postmandemo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class WebController {

    @GetMapping("/current-date")
    public String GetDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dateTimeFormatter.format(now);
    }

    @PostMapping("/welcome/{name}")
    public ResponseEntity<String> greeting(@PathVariable(value = "name") String name) {
        return new ResponseEntity<String>("Welcome " + name , HttpStatus.OK);
    }
}