package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

        zofka.setLocation(300.0,300.0);
        nakresliRovnostrannyTrojuhelnik(70.0, Color.blue);

        zofka.setLocation(400.0,300.0);
        nakresliCtverec(70.0, Color.red);

        zofka.setLocation(570.0,300.0);
        nakresliObdelnik(70.0, 120, Color.yellow);

        zofka.setLocation(820.0,300.0);
        nakresliKolecko(8, Color.green);
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
