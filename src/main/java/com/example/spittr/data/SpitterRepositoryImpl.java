package com.example.spittr.data;

import com.example.spittr.Spitter;
import org.springframework.stereotype.Repository;

@Repository
public class SpitterRepositoryImpl implements SpitterRepository {
    @Override
    public Spitter findByUsername(String username) {
        return new Spitter("Jack", "Bauer", username, "24hours");
    }

    @Override
    public Spitter save(Spitter spitter) {
       return new Spitter(24L, spitter.getFirstName(), spitter.getLastName(), spitter.getUsername(), spitter.getPassword());
    }
}
