package HomeWork6.Competitions;

import HomeWork6.Competitions.barriers.Racetrack;
import HomeWork6.Competitions.barriers.Wall;
import HomeWork6.Competitions.participants.Cat;
import HomeWork6.Competitions.participants.Human;
import HomeWork6.Competitions.participants.Robot;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Participant> participants = new ArrayList<>();
        ArrayList<Barrier> barriers = new ArrayList<>();

        participants.add(new Human("John", 3.2f, 200.0f));
        participants.add(new Cat("Tom", 0.5f, 50.0f));
        participants.add(new Robot("Barri", 3.0f, 500.0f));
        participants.add(new Human("David", 1.2f, 270.0f));

        barriers.add(new Wall(2.0f));
        barriers.add(new Racetrack(250.0f));
        barriers.add(new Wall(1.0f));
        barriers.add(new Racetrack(600.0f));
        barriers.add(new Wall(3.5f));
        barriers.add(new Racetrack(150.0f));

        for (Barrier i : barriers) {
            for (Participant j : participants) {
                if (j.getIsParticipant())
                    i.overcome(j);
            }
        }
    }
}
