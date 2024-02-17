package HomeWork6.Competitions;

public interface Participant {
    void run(Barrier barrier);

    void jump(Barrier barrier);

    boolean getIsParticipant();

    void setIsParticipant(boolean isParticipant);
}
