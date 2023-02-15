package com.tennisApp.Auth.Controllers;

import com.tennisApp.Auth.Models.TennisPlayer;
import com.tennisApp.Auth.Services.ManageTennisPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manageTennisPlayer")
public class ManageTennisPlayerController {

    @Autowired
    private ManageTennisPlayerService manageTennisPlayerService;

    @PostMapping("/update")
    public ResponseEntity<TennisPlayer> updateTennisPlayerProfile(@RequestBody TennisPlayer tennisPlayer){
        TennisPlayer updatedTennisPlayer = manageTennisPlayerService.updateTennisPlayer(tennisPlayer);
        if (updatedTennisPlayer != null){
            return ResponseEntity.ok(updatedTennisPlayer);
        }

        return ResponseEntity.status(409).body(tennisPlayer);
    }
}
