package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

        nakresliRovnostrannyTrojuhelnik (80, Color.red);

    }


    public void nakresliRovnostrannyTrojuhelnik (double delkaStrany, Color barva) {
        zofka.turnRight(90);

        zofka.setPenColor(barva);
        zofka.move(delkaStrany);
        zofka.turnLeft(120.0);
        zofka.move(delkaStrany);
        zofka.turnLeft(120.0);
        zofka.move(delkaStrany);
        zofka.turnLeft(120.0);
    }

//    Turtle zofka;
//
//    public static void main(String[]args) {
//        zofka = new Turtle();
//
//        zofka.setLocation(100.0,100.0);
//        // Volani metody, do ktere se preda hodnota 50.0
//        nakresliRovnostrannyTrojuhelnik(50.0);
//
//        zofka.setLocation(300.0,100.0);
//        // Volani metody, do ktere se preda hodnota 70.0
//        nakresliRovnostrannyTrojuhelnik(70.0);
//    }
//
//    public void nakresliRovnostrannyTrojuhelnik(double velikostStrany) {
//        // Zde lze používat proměnnou velikostStrany.
//        // Jeji hodnota je takova, s jakou byla metoda zavolana
//        zofka.move(velikostStrany);
//        zofka.turnLeft(120.0);
//        zofka.move(velikostStrany);
//        zofka.turnLeft(120.0);
//        zofka.move(velikostStrany);
//        zofka.turnLeft(120.0);
//    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
