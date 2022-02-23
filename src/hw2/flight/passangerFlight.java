package hw2.flight;

public class passangerFlight implements Flight {
    private int numPassangers;

    public passangerFlight(int numPassangers) {
        setPassangers(numPassangers);
    }

    private void setPassangers(int PassangersIn) {
        if(PassangersIn > 0) {
            numPassangers = PassangersIn;
        }
    }

    public int getNumPassangers() {
        return numPassangers;
    }

}
