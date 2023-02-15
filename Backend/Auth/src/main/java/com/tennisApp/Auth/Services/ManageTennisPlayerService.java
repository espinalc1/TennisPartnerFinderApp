package com.tennisApp.Auth.Services;

import com.tennisApp.Auth.Models.TennisPlayer;
import com.tennisApp.Auth.Repos.ManageTennisPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageTennisPlayerService {
    @Autowired
    ManageTennisPlayerRepository manageTennisPlayerRepository;

    public TennisPlayer updateTennisPlayer(TennisPlayer tennisPlayer){

        TennisPlayer retrievedTennisPlayer = getTennisPlayer(tennisPlayer);
        if (retrievedTennisPlayer != null){
            tennisPlayer.setId(retrievedTennisPlayer.getId());
            return manageTennisPlayerRepository.save(tennisPlayer);
        }

        return null;
    }

    public TennisPlayer getTennisPlayer(TennisPlayer tennisPlayer){
        return manageTennisPlayerRepository.findByUserName(tennisPlayer.getUserName());
    }
}

