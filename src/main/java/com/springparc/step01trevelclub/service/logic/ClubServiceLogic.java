package com.springparc.step01trevelclub.service.logic;

import com.springparc.step01trevelclub.entity.TravelClub;
import com.springparc.step01trevelclub.service.ClubService;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ClubServiceLogic implements ClubService {

    private TravelClub[] clubs;
    private int index;

    public ClubServiceLogic(){
        this.clubs = new TravelClub[10];
        this.index = 0;

    }

    @Override
    public void register(TravelClub travelClub) {
        clubs[index] = travelClub;
        index++;
    }

    @Override
    public TravelClub[] findAll() {
        //copyOfRange 를 사용하면 어디부터 어디까지 복사해서 돌려보낼것인지 정할 수 있다.
        // Arrays에 대해서도 공부하자
        return Arrays.copyOfRange(clubs, 0, index);
    }

    @Override
    public TravelClub[] findByName(String clubName) {
        return new TravelClub[0];
    }

    @Override
    public TravelClub findById(String clubId) {
        return null;
    }

    @Override
    public void modify(TravelClub travelClub) {

    }

    @Override
    public void remove(String clubId) {

    }
}
