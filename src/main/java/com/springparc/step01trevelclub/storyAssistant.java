package com.springparc.step01trevelclub;

import com.springparc.step01trevelclub.entity.TravelClub;
import com.springparc.step01trevelclub.util.DateUtil;

public class storyAssistant {

    public static void main(String[] args) {
        Long currentTime = System.currentTimeMillis();
//        System.out.println(currentTime);
//        System.out.println(DateUtil.today());
        TravelClub newClub = new TravelClub("Jeju", "Jeju TravelClub");
        System.out.println(newClub.toString());

        System.out.println(TravelClub.getSample().toString());

    }

}
