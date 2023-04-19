package com.springparc.step01trevelclub.ui.console;

import com.springparc.step01trevelclub.entity.TravelClub;
import com.springparc.step01trevelclub.util.ConsoleUtil;

public class ClubConsole {

    private ConsoleUtil consoleUtil;

    public ClubConsole(){
        this.consoleUtil = new ConsoleUtil();
    }
    public void register(){
        //
        while (true){
            String clubName = consoleUtil.getValueOf("Club Name(0.Club Menu)");
            //문자열은 equlas로 비교해야한다.
            if(clubName.equals("0")){
                return;
            }

            String intro = consoleUtil.getValueOf("Club Intro(0.Club Menu)");
            if(intro.equals("0")){
                return;
            }

            TravelClub newClub = new TravelClub(clubName, intro);
            //배열에 저장 (클럽 서비스에서 진행)
            System.out.println("Registered club : " + newClub.toString());


        }
    }

    public void findAll(){
        //
        System.out.println("Find All");
    }

    public void findById(){

    }

}
