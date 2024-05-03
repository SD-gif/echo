package com.example.echo;

import com.example.echo.data.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoordinateController {

    @PostMapping("/echo/art")
    public ArtDTO check_Art(@RequestBody ArtDTO artDTO) {
        return artDTO;
    }

    @PostMapping("/echo/museum")
    public MuseumDTO check_Museum(@RequestBody MuseumDTO museumDTO) {
        return museumDTO;
    }

    @PostMapping("/echo/user")
    public UserDTO check_User(@RequestBody UserDTO userDTO) {
        return userDTO;
    }

    @PostMapping("/response_ok")
    public ResponseEntity<String> alwaysOK() {
        return ResponseEntity.ok().build(); //return 200ok
    }

    @PostMapping("/response_bad")
    public ResponseEntity<String> alwaysBadRequest() {
        return ResponseEntity.badRequest().build(); //return Bad Request
    }

}