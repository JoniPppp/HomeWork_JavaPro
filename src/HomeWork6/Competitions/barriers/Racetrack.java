package HomeWork6.Competitions.barriers;

import HomeWork6.Competitions.Barrier;
import HomeWork6.Competitions.Participant;

public class Racetrack implements Barrier {
    private final float length;

    public Racetrack(float length) {
        this.length = length;
    }

    @Override
    public void overcome(Participant participant) {
        participant.run(this);
    }

    public String getBarrierType() {
        return "бігова доріжка";
    }

    public float getLength() {
        return length;
    }
}
