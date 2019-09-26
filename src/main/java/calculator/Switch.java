package calculator;

import java.util.Scanner;

public class Switch {

    public Calc options() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        try {
            option = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Bad value");
            backMenu();
        }
        switch (option){
            case 1 :
                return Calc.ADD;
            case 2 :
                return Calc.SUB;
            case 3 :
                return Calc.MULTI;
            case 4 :
                return Calc.DIV;
            default:
                return Calc.ERROR;

        }

    }

    public void backMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want back to menu, press ENTER");
        scanner.nextLine();
    }
}
