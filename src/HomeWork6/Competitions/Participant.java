package HomeWork6.Competitions;

import HomeWork6.Competitions.barriers.Racetrack;
import HomeWork6.Competitions.barriers.Wall;

public abstract class Participant {
    public String participantType;
    public String participantName;
    public float maxJumpHeight;
    public float maxRunDistance;
    public boolean isParticipant;

    public Participant(String participantName, float maxJumpHeight, float maxRunDistance) {
        this.participantName = participantName;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
        this.isParticipant = true;
    }

    public void run(Racetrack racetrack) {
        System.out.println(this.participantType + " " + this.participantName +
                " виходить на перешкоду Бігова доріжка. На старт. Увага! Вперед!");

        if (this.getMaxRunDistance() < racetrack.getLength()) {
            System.out.println("Учасник " + this.participantType.toLowerCase() + " " + this.participantName +
                    " не пройшов перешкоду " + racetrack.getBarrierType() + " на дистанції " +
                    racetrack.getLength() + ". Пройдено " + this.getMaxRunDistance());
            this.setIsParticipant(false);
        }


        else
            System.out.println("Учасник " + this.participantType.toLowerCase() + " " + this.participantName +
                    " пройшов перешкоду " + racetrack.getBarrierType() + " на дистанції " +
                    racetrack.getLength());
        System.out.println();

    }

    public void jump(Wall wall) {
        System.out.println(this.participantType + " " + this.participantName +
                " виходить на перешкоду Стіна. На старт. Увага! Вперед!");

        if (this.maxJumpHeight < wall.getHeight()) {
            System.out.println("Учасник " + this.participantType.toLowerCase() + " " + this.participantName +
                    " не пройшов перешкоду " + wall.getBarrierType() + " на дистанції " +
                    wall.getHeight() + ". Пройдено " + this.getMaxJumpHeight());
            this.setIsParticipant(false);
        }

        else
            System.out.println("Учасник " + this.participantType.toLowerCase() + " " + this.participantName +
                    " пройшов перешкоду " + wall.getBarrierType() + " на дистанції " +
                    wall.getHeight());
        System.out.println();
    }

    public float getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public float getMaxRunDistance() {
        return maxRunDistance;
    }

    public boolean getIsParticipant() {
        return isParticipant;
    }

    public void setIsParticipant(boolean isParticipant) {
        this.isParticipant = isParticipant;
    }
}
