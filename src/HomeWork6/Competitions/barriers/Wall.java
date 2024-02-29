package HomeWork6.Competitions.barriers;

import HomeWork6.Competitions.Barrier;

public class Wall implements Barrier {
    private final float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public String getBarrierType() {
        return "стіна";
    }

    public float getHeight() {
        return height;
    }

}
