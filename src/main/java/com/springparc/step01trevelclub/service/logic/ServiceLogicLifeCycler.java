package com.springparc.step01trevelclub.service.logic;

import com.springparc.step01trevelclub.service.ClubService;

public class ServiceLogicLifeCycler {

    private static ServiceLogicLifeCycler uniqueInstance;

    private ClubService clubService;

    private ServiceLogicLifeCycler(){
        this.clubService = new ClubServiceLogic();
    }

    public static ServiceLogicLifeCycler getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ServiceLogicLifeCycler();
        }
        return uniqueInstance;
    }

    public ClubService getClubService(){

//        if(clubService == null){
//            clubService = new ClubServiceLogic();
//        }

        return this.clubService;
    }

}
