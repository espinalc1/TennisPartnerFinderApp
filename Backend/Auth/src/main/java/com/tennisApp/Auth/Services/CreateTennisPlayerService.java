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
        TennisPlayer createdTennisPlayer;
        if (this.isUnique(tennisPlayer)){
            return createTennisPlayerRepository.save(tennisPlayer);
        }
        return null;
    }

    public Boolean isUnique(TennisPlayer tennisPlayer){
        TennisPlayer foundTennisPlayer = createTennisPlayerRepository.findByUserName(tennisPlayer.getUserName());
        return (foundTennisPlayer == null);
    }
}
