package HomeWork6.Competitions.participants;

import HomeWork6.Competitions.Barrier;
import HomeWork6.Competitions.Participant;

public class Cat extends Participant {

    public Cat(String participantName, float maxJumpHeight, float maxRunDistance) {
        super(participantName, maxJumpHeight, maxRunDistance);
        this.participantType  = "Кіт";
    }

}
