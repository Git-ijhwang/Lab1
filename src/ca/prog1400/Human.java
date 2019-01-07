package ca.prog1400;

public class Human {
    boolean sex;
    String name = "Injun";
    int age;
    int tall;
    int weight;

    public String character (int oldType) {
        if (oldType == 0) {
            return "good";
        }
        else {
            return "nice";
        }
    }
}
