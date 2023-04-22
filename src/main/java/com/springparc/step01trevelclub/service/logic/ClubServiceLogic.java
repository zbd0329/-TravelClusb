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

    //이름으로 찾기
    @Override
    public TravelClub[] findByName(String clubName) {
        TravelClub[] createdClubs = Arrays.copyOfRange(clubs, 0 , index);
        TravelClub[] foundClubs = new TravelClub[createdClubs.length]; //만들어진 클럽 갯수만큼 배열을 만들어준다
        int subIndex = 0;

        for(TravelClub club : createdClubs){
            if(club.getClubName().equals(clubName)){
                foundClubs[subIndex] = club;
                subIndex++;
            }
        }



        return Arrays.copyOfRange(foundClubs,0,subIndex);
    }

    // 아이디로 찾기
    @Override
    public TravelClub findById(String clubId) {
        TravelClub[] createdClubs = Arrays.copyOfRange(clubs, 0 , index);
        TravelClub foundClub = null;
        for(TravelClub club : createdClubs){
            //문자열 비교이기 때문에 equals로 비교해야한다
            if(club.getId().equals(clubId)){
                foundClub =club;
                break;

            }
        }
        return foundClub;
    }

    //수정 기능구현
    @Override
    public void modify(TravelClub modifyClub) {
        int foundIndex = 0;
        for(int i =0; i < clubs.length ; i++){
            if(clubs[i].getId().equals(modifyClub.getId())){
                foundIndex = i;
                break;
            }
        }
        this.clubs[foundIndex] = modifyClub;


    }

    //삭제 기능 구현
    @Override
    public void remove(String clubId) {
        int foundIndex = 0;
        for(int i =0; i < clubs.length ; i++){
            if(clubs[i].getId().equals(clubId)){
                foundIndex = i;
                break;
            }
        }

        for(int i = foundIndex; i < this.index + 1; i++){
            clubs[i] = clubs[i+1];
        }

        this.index--;

    }
}
