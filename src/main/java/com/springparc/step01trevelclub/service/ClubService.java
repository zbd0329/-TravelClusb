package com.springparc.step01trevelclub.service;

import com.springparc.step01trevelclub.entity.TravelClub;
import java.util.TreeMap;

public interface ClubService {

    void  register(TravelClub travelClub);
    TravelClub [] findAll();
    TravelClub [] findByName(String clubName);
    TravelClub findById(String clubId);

    void modify(TravelClub travelClub);
    void remove(String clubId);


}
