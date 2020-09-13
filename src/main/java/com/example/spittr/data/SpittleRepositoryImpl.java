package com.example.spittr.data;

import com.example.spittr.Spittle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class SpittleRepositoryImpl implements SpittleRepository {

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittleList = new ArrayList<>();
        spittleList.add(new Spittle("Hello World! The first ever spittle!", new Date(), 0.0, 0.0));
        spittleList.add(new Spittle("Here's another spittle", new Date(), 0.0, 0.0));
        spittleList.add(new Spittle("Spittle spittle spittle!", new Date(), 0.0, 0.0));
        spittleList.add(new Spittle("Spittles go fourth!", new Date(), 0.0, 0.0));
        return spittleList;
    }

    @Override
    public Spittle findOne(long id) {
        return new Spittle("Hello World! The first ever spittle!", new Date(), 0.0, 0.0);
    }

}
