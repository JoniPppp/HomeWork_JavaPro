package HomeWork6.Competitions.participants;

import HomeWork6.Competitions.Barrier;
import HomeWork6.Competitions.Participant;
import HomeWork6.Competitions.barriers.Racetrack;
import HomeWork6.Competitions.barriers.Wall;

public class Cat implements Participant {
    private final String participantType = "Кіт";
    private final String participantName;
    private final float maxJumpHeight;
    private final float maxRunDistance;
    private boolean isParticipant = true;

    public Cat(String participantName, float maxJumpHeight, float maxRunDistance) {
        this.participantName = participantName;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
    }

    public void run(Barrier barrier) {
        System.out.println(this.participantType + " " + this.participantName +
                " виходить на перешкоду Бігова доріжка. На старт. Увага! Вперед!");

        if (this.getMaxRunDistance() < ((Racetrack) barrier).getLength()) {
            System.out.println("Учасник " + this.participantType.toLowerCase() + " " + this.participantName +
                    " не пройшов перешкоду " + ((Racetrack) barrier).getBarrierType() + " на дистанції " +
                    ((Racetrack) barrier).getLength() + ". Пройдено " + this.getMaxRunDistance());
            this.setIsParticipant(false);
        }


        else
            System.out.println("Учасник " + this.participantType.toLowerCase() + " " + this.participantName +
                    " пройшов перешкоду " + ((Racetrack) barrier).getBarrierType() + " на дистанції " +
                    ((Racetrack) barrier).getLength());
        System.out.println();

    }

    @Override
    public void jump(Barrier barrier) {
        System.out.println(this.participantType + " " + this.participantName +
                " виходить на перешкоду Стіна. На старт. Увага! Вперед!");

        if (this.maxJumpHeight < ((Wall) barrier).getHeight()) {
            System.out.println("Учасник " + this.participantType.toLowerCase() + " " + this.participantName +
                    " не пройшов перешкоду " + ((Wall) barrier).getBarrierType() + " на дистанції " +
                    ((Wall) barrier).getHeight() + ". Пройдено " + this.getMaxJumpHeight());
            this.setIsParticipant(false);
        }

        else
            System.out.println("Учасник " + this.participantType.toLowerCase() + " " + this.participantName +
                    " пройшов перешкоду " + ((Wall) barrier).getBarrierType() + " на дистанції " +
                    ((Wall) barrier).getHeight());
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
