package _05_test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        List<Vehicle> ve = new ArrayList<>();

        ve.add(new Car());
        ve.add(new Airplane());

        for(Vehicle ves : ve){
            ves.move();

            if (ves instanceof Flyable) {
                ((Flyable) ves).fly();
            }
        }
    }
}

