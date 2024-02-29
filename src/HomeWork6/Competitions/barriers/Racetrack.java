package HomeWork6.Competitions.barriers;

import HomeWork6.Competitions.Barrier;

public class Racetrack implements Barrier {
    private final float length;

    public Racetrack(float length) {
        this.length = length;
    }

    @Override
    public String getBarrierType() {
        return "бігова доріжка";
    }

    public float getLength() {
        return length;
    }
}
