package com.tennisApp.Auth.Repos;

import com.tennisApp.Auth.Models.TennisPlayer;
import org.springframework.data.repository.CrudRepository;

public interface ManageTennisPlayerRepository extends CrudRepository<TennisPlayer, Long> {
    public TennisPlayer save(TennisPlayer tennisPlayer);
    public TennisPlayer findByUserName(String userName);
}
