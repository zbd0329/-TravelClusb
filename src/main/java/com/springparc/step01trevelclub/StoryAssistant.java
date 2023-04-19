package com.springparc.step01trevelclub;

import com.springparc.step01trevelclub.ui.menu.ClubMenu;

public class StoryAssistant {

//    public static void main(String[] args) {
//        Long currentTime = System.currentTimeMillis();
////        System.out.println(currentTime);
////        System.out.println(DateUtil.today());
//        TravelClub newClub = new TravelClub("Jeju", "Jeju TravelClub");
//        System.out.println(newClub.toString());
//
//        System.out.println(TravelClub.getSample().toString());
//
//    }

    private void startStory(){
        ClubMenu clubMenu = new ClubMenu();
        clubMenu.show();
    }

    public static void main(String[] args) {
        StoryAssistant assistant = new StoryAssistant();
        assistant.startStory();
    }

}
