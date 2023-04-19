package com.springparc.step01trevelclub.ui.console;

import com.springparc.step01trevelclub.service.ClubService;
import com.springparc.step01trevelclub.service.logic.ServiceLogicLifeCycler;

public class ClubSubConsole {
    private ClubService clubService;

    public ClubSubConsole(){
        this.clubService = ServiceLogicLifeCycler.getUniqueInstance().getClubService();
    }

}
