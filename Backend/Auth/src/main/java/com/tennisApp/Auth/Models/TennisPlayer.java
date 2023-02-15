package com.tennisApp.Auth.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * 1. first name
 * 2. last name
 * 3. user name
 * 4. password
 * 5. gender
 * 6. age
 * 7. USTA Rating
**/
@Entity
@Data
@NoArgsConstructor
public class TennisPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @NonNull
    private String userName;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String password;
    @NonNull
    private String gender;
    private Integer age;
    private Double ustaRating;
}
