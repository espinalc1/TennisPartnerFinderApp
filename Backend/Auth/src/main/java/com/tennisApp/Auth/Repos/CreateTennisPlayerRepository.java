package com.tennisApp.Auth.Repos;


import com.tennisApp.Auth.Models.TennisPlayer;
import org.springframework.data.repository.CrudRepository;

public interface CreateTennisPlayerRepository extends CrudRepository<TennisPlayer, Long> {
    public TennisPlayer findByUserName(String tennisPlayerUserName);
}
