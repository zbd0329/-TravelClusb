package com.springparc.step01trevelclub.ui.menu;

import com.springparc.step01trevelclub.ui.console.ClubConsole;
import java.util.Scanner;

public class ClubMenu {

    private Scanner scanner;
    private ClubConsole console;
    public ClubMenu(){
        this.scanner = new Scanner(System.in); //표준입력
        this.console = new ClubConsole();

    }

    public void show(){
        int inputNumber = 0;


        while (true){
            displayMenu();
            inputNumber = selectMenu();

            System.out.println(inputNumber);

            switch (inputNumber){
                case 1:
                     console.register();
                    break;
                case 2:
                    console.findAll();
                    break;
                case 3:
                    console.findById();
                    break;
                case 4:
                    console.findByName();
                    break;
                case 5:
                    console.modify();
                    break;
                case 6 :
                    console.remove();
                    break;
                case 0 :
                    //
                    return;
                default:
                    System.out.println("Choose again!");
            }
        }
    }

    private void displayMenu(){
        System.out.println("..............................");
        System.out.println("Club Menu");
        System.out.println("..............................");
        System.out.println("1. Club Resister");
        System.out.println("2. Club Find(ALL)");
        System.out.println("3. Club Find(ID)");
        System.out.println("4. Club Find(Name)");
        System.out.println("5. Club Modify");
        System.out.println("6. Club Remove");
        System.out.println("..............................");
        System.out.println("0. Previous");
        System.out.println("..............................");

    }

    private int selectMenu(){
        System.out.print("Select : ");
        int menuNumber = scanner.nextInt();
        if(menuNumber >= 0 && menuNumber <= 6){
            scanner.nextLine();
            return menuNumber;
        }else{
            System.out.println("It's a invalid number --> " + menuNumber);
            return -1;
        }
    }

}
