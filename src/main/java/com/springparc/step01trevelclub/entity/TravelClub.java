package com.springparc.step01trevelclub.entity;

import com.springparc.step01trevelclub.util.DateUtil;
import java.util.UUID;

public class TravelClub {

    //Fields
    // todo : 사용자 정의 상수
    private static final int MINIMUM_NAME_LENTH = 3;
    private static final int MINIMUM_INTRO_LENTH =10;

    //Fields, 외부에서 임의로 값을 바꾸지 못하게 해야한다. private로 하는 이유.
    private String id;
    private String clubName;
    private String intro;
    private String foundationDay;

    //Constructors
    private TravelClub(){
        //UUID : 고유한 식별자를 만들어준다.
        this.id = UUID.randomUUID().toString();
    }

    public TravelClub(String clubName, String intro){
        this();
//        this.clubName = clubName;
        setClubName(clubName); //제약조건을 걸은 세터를 통해 초기화
//        this.intro = intro;
        setIntro(intro);
        this.foundationDay = DateUtil.today();
        //this 는 0번째 전달인자
        //클럽네임과 인트로를 갖고 초기화를 진행
    }



    // todo : this(clubName, intro) 생성자 그대로 가져와서 쓰는 방법
//    public  TravelClub(String clubName, String intro, String message){
////        this.id = UUID.randomUUID().toString(); //UUID : 고유한 식별자를 만들어준다.
////        this.clubName = clubName;
////        this.intro = intro;
//        this(clubName, intro); //이전에 있는 생성자를 그대로 가져와서 쓸 수 있다. 중복 하지 않아도 됨.
//        this.message = message;
//    }

    // todo : 세터, 게터를 사용하는 이유
    /**
     * 클래스 내부의 필드값은 외부에서 접근하지 못하도록 해야한다.
     * 클래스 내부에 있는 메소드를 통해서 접근할 수 있게 해야한다.
     * 그걸 가능하게 해주는 것이 세터와 게터다. (엔티티에서)
     */

    //setter
    public void setClubName(String clubName){
        if(clubName.length() < MINIMUM_NAME_LENTH) {
            System.out.println("클럽이름은 "+MINIMUM_NAME_LENTH + "자 이상이어야 합니다");
            return ;
        }
        this.clubName = clubName;
    }

    //getter
    public String getClubName(){
        return this.clubName;
    }

    public void setIntro(String intro){
        if(intro .length() < MINIMUM_INTRO_LENTH){
            System.out.println("클럽소개는 " + MINIMUM_INTRO_LENTH + "자 보다 길어야 합니다");
            return;
        }
        this.intro = intro;
    }

    public String getIntro(){
        return this.intro;
    }

    public String getId(){
        return getId();
    }

    public String getFoundationDay(){
        return getFoundationDay();
    }

    //테스트를 위한 세팅
    public static TravelClub getSample(){
//        String clubName ="sample Club";
//        String intro = "sample Club Intro";
//        TravelClub sampleClub = new TravelClub(clubName, intro);
//        return sampleClub;

        //한줄로 정리 가능
        return new TravelClub("Smaple Club","Sample intro");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TravelClub club ID : ").append(id);
        builder.append(", clubName : ").append(clubName);
        builder.append(", intro : ").append(intro);
        builder.append(", FoundationDay : ").append(foundationDay);

        return builder.toString();
    }
}
