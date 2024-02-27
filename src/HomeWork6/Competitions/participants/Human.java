package HomeWork6.Competitions.participants;

import HomeWork6.Competitions.Participant;

public class Human extends Participant {

    public Human(String participantName, float maxJumpHeight, float maxRunDistance) {
        super(participantName, maxJumpHeight, maxRunDistance);
        this.participantType  = "Людина";
    }

}
