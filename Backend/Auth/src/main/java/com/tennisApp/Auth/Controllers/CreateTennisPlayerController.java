package com.tennisApp.Auth.Controllers;

import com.tennisApp.Auth.Models.TennisPlayer;
import com.tennisApp.Auth.Services.CreateTennisPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateTennisPlayerController {
    @Autowired
    private CreateTennisPlayerService s;

    // has to return a success or fail
    @PostMapping("/")
    public ResponseEntity<TennisPlayer> createUser(@RequestBody TennisPlayer tennisPlayer) {
        TennisPlayer createdTennisPlayer = s.createTennisPlayer(tennisPlayer);
        if (createdTennisPlayer != null){
            return ResponseEntity.ok(createdTennisPlayer);
        }

        return ResponseEntity.status(409).body(tennisPlayer);
            // Create a user type
    }


}
