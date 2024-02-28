package HomeWork6.Competitions.barriers;

import HomeWork6.Competitions.Barrier;
import HomeWork6.Competitions.Participant;

public class Wall implements Barrier {
    private final float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public void overcome(Participant participant) {
        participant.jump(this);
    }
    @Override
    public String getBarrierType() {
        return "стіна";
    }

    public float getHeight() {
        return height;
    }

}
