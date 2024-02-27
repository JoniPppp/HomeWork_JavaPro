package HomeWork6.Competitions.participants;

import HomeWork6.Competitions.Participant;

public class Robot extends Participant {

    public Robot(String participantName, float maxJumpHeight, float maxRunDistance) {
        super(participantName, maxJumpHeight, maxRunDistance);
        this.participantType  = "Робот";
    }

}
