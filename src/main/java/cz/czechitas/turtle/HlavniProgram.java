package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

//        Cast 2 / zofka kresli kazdou vec zvlast

//        Zofka kresli zmrzlinu

        zofka.setLocation(300,300);
        nakresliZmrzlinu(Color.blue);

//        Zofka kresli snehulaka

//        zofka.setLocation(500,300);
//        nakresliKolecko(5, Color.red);
//        zofka.setLocation(475, 170);
//        nakresliKolecko(8, Color.red);
//        zofka.setLocation(450, 420);
//        nakresliKolecko(4, Color.red);
//        zofka.setLocation(420, 260);
//        nakresliKolecko(10, Color.red);
//        zofka.setLocation(580,210);
//        nakresliKolecko(10, Color.red);

//        zofka kresli masinku

//        zofka.setLocation(600, 400);
//        nakresliRovnostrannyTrojuhelnik(100, Color.green);
//        zofka.penUp();
//        zofka.move(40);
//        zofka.penDown();
//        nakresliObdelnik(100, 200, Color.green);
//        zofka.penUp();
//        zofka.turnRight(90);
//        zofka.move(300);
//        zofka.turnRight(180);
//        zofka.penDown();
//        nakresliObdelnik(100, 200, Color.green);
//        nakresliKolecko(6, Color.green);
//        zofka.setLocation(630,390);
//        nakresliKolecko(8, Color.green);
//        zofka.setLocation(720,395);
//        nakresliKolecko(8, Color.green);

//        Cast 1 / zakladni obrazce

//        zofka.setLocation(300.0,300.0);
//        nakresliRovnostrannyTrojuhelnik(70.0, Color.blue);
//
//        zofka.setLocation(400.0,300.0);
//        nakresliCtverec(70.0, Color.red);
//
//        zofka.setLocation(570.0,300.0);
//        nakresliObdelnik(70.0, 120, Color.yellow);
//
//        zofka.setLocation(820.0,300.0);
//        nakresliKolecko(8, Color.green);
    }

    public void nakresliZmrzlinu (Color barva) {
        zofka.setPenColor(barva);
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(42);
        zofka.turnRight(110);
        zofka.move(130);
        zofka.turnRight(140);
        zofka.move(130);
        zofka.turnRight(110);
        zofka.move(42);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(42);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliKolecko(7, barva);
    }

    public void nakresliRovnostrannyTrojuhelnik (double delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        zofka.move(delkaStrany);
        zofka.turnLeft(120.0);
        zofka.move(delkaStrany);
        zofka.turnLeft(120.0);
        zofka.move(delkaStrany);
        zofka.turnLeft(120.0);
    }

    public void nakresliCtverec (double delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        zofka.move(delkaStrany);
        zofka.turnRight(90);
        zofka.move(delkaStrany);
        zofka.turnRight(90);
        zofka.move(delkaStrany);
        zofka.turnRight(90);
        zofka.move(delkaStrany);
        zofka.turnRight(90);
    }

    public void nakresliObdelnik (double delkaStranyA, double delkaStranyB, Color barva) {
        zofka.setPenColor(barva);
        zofka.move(delkaStranyA);
        zofka.turnRight(90);
        zofka.move(delkaStranyB);
        zofka.turnRight(90);
        zofka.move(delkaStranyA);
        zofka.turnRight(90);
        zofka.move(delkaStranyB);
        zofka.turnRight(90);
    }

    public void nakresliKolecko (int uhel, Color barva) {
        zofka.turnLeft(90);
        zofka.setPenColor(barva);
        for (int i = 0; i < 100; i++) {
                zofka.move(5);
                zofka.turnRight(uhel);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
