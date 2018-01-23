/**
 * Created by Brett Patterson on 1/23/2018.
 */
public class BoxClass {

    private State state;

    public enum State{
        empty,
        player1,
        player2
    }

    public BoxClass(){
        state = State.empty;
    }

    public State getState(){
        return state;
    }

    public void setState(State state){
        this.state = state;
    }

    @Override
    public String toString() {
        switch (state){
            case empty:
                return " ";
            case player1:
                return "X";
            case player2:
                return "O";
            default:
                return "?";
        }
    }
}