package calculator;


import calculator.method.AddNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Calculator by Mariusz");
        Menu menu = new Menu();
        Switch switch1 = new Switch();
        menu.description();

        Calc calc = switch1.options();

        switch (calc){
            case ADD:
                AddNumber addNumber = new AddNumber();
                addNumber.addNumber(1,2);
        }


    }
}
