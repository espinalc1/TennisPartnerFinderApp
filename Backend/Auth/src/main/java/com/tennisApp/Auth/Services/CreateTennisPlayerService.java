package com.tennisApp.Auth.Services;

import com.tennisApp.Auth.Models.TennisPlayer;
import com.tennisApp.Auth.Repos.CreateTennisPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class CreateTennisPlayerService {
    @Autowired
    private CreateTennisPlayerRepository createTennisPlayerRepository;
    public TennisPlayer createTennisPlayer(TennisPlayer tennisPlayer){
        // this should help us access a repo
        TennisPlayer createdTennisPlayer = createTennisPlayerRepository.save(tennisPlayer);

        return createdTennisPlayer;
    }
}
