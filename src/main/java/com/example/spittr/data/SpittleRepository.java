package com.example.spittr.data;

import java.util.List;
import com.example.spittr.Spittle;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long id);
}