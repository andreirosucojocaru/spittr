package com.example.spittr.data;

import com.example.spittr.Spitter;

public interface SpitterRepository {
    public Spitter findByUsername(String username);

    public Spitter save(Spitter spitter);
}
