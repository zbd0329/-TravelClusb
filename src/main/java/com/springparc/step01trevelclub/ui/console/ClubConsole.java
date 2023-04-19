package com.springparc.step01trevelclub.ui.console;

import com.springparc.step01trevelclub.entity.TravelClub;
import com.springparc.step01trevelclub.service.ClubService;
import com.springparc.step01trevelclub.service.logic.ClubServiceLogic;
import com.springparc.step01trevelclub.util.ConsoleUtil;

public class ClubConsole {

    private ConsoleUtil consoleUtil;

    private ClubService clubService;

    public ClubConsole(){
        this.consoleUtil = new ConsoleUtil();
        // 이후 변경될 코드
        this.clubService = new ClubServiceLogic();
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
            clubService.register(newClub);

            System.out.println("Registered club : " + newClub.toString());


        }
    }

    public void findAll(){
        //
        TravelClub[] foundClub = clubService.findAll();
        if(foundClub.length == 0){
            System.out.println("Empty~~~");
            return;
        }

        for(TravelClub club : foundClub){
            System.out.println(club.toString());
        }
    }

    public void findById(){
        //초기화
        TravelClub foundClub = null;

        while(true){
            String clubId = consoleUtil.getValueOf("Club id to find(0.Club Menu)");
            if(clubId.equals("0")){
                break;
            }

            foundClub = clubService.findById(clubId);

            if(foundClub != null){
                System.out.println(foundClub); //.toString()이 생략된 것
            }else{
                System.out.println("Can not find club ID :" + clubId);
            }
        }

    }

    public void findByName(){
        TravelClub[] foundClubs = null;
        while (true){
            String clubName = consoleUtil.getValueOf("Club name to find(0.Club Menu)");
            if(clubName.equals("0")){
                break;
            }

            foundClubs = clubService.findByName(clubName);

            if(foundClubs != null && foundClubs.length != 0){
                for(TravelClub club : foundClubs){
                    System.out.println(club);
                }
            }else{
                System.out.println("Can not find club ID :" + clubName);
            }

        }

    }

    private TravelClub findOne(){
        //초기화
        TravelClub foundClub = null;

        while(true){
            String clubId = consoleUtil.getValueOf("Club id to find(0.Club Menu)");
            if(clubId.equals("0")){
                break;
            }

            foundClub = clubService.findById(clubId);

            if(foundClub != null){
                break;
            }else{
                System.out.println("Can not find club ID :" + clubId);
            }
        }
        return foundClub;

    }

    public void modify(){
        TravelClub targetClub = findOne();

        String newName = consoleUtil.getValueOf("New Club name(0.club Menu, Enter. No Change");
        if(newName.equals("0")){
            return;
        }

        if(!newName.isEmpty()){
            targetClub.setClubName(newName);
        }

        String newIntro = consoleUtil.getValueOf("New Club intro(0.club Menu, Enter. No Change");

        if(newName.equals("0")){
            return;
        }

        if(!newName.isEmpty()){
            targetClub.setIntro(newIntro);
        }

        clubService.modify(targetClub);

        System.out.println("Modify Club : " + targetClub.toString());


    }

    public void remove(){
        TravelClub targetClub = findOne();

        String confirmStr = consoleUtil.getValueOf("Remove this club? (Y:yew, N:no");
        if(confirmStr.toLowerCase().equals("y") || confirmStr.toLowerCase().equals("yes")){
            System.out.println("Removing a club -->" + targetClub.getClubName());
            clubService.remove(targetClub.getId());
        }else{
            System.out.println("Remove cancelled, your club is safe. " + targetClub.getClubName());
        }

    }

}
