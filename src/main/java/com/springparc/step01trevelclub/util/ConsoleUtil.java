package com.springparc.step01trevelclub.util;

import java.util.Scanner;

public class ConsoleUtil {
    private Scanner scanner;

    public ConsoleUtil(){
        this.scanner = new Scanner(System.in);
    }

    public String getValueOf(String label){
        System.out.print(label + "  : ");
        String inputStr = scanner.nextLine();
        inputStr = inputStr.trim();
        //trim() = String Class가 갖고있는 메소드 문자열외 공백을 생략해준다.
        return inputStr;
    }

}
