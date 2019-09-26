package calculator;

public class Menu {

    String one = "If you want ADD - press 1\n";
    String two = "If you want SUB - press 2\n";
    String three = "If you want MULTI - press 3\n";
    String four = "If you want DIV - press 4";

    public void description(){
        StringBuilder builder = new StringBuilder();
        builder.append(one)
                .append(two)
                .append(three)
                .append(four);
        String build = builder.toString();
        System.out.println(build);
    }
}
