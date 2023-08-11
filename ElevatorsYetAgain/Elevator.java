package ElevatorsYetAgain;

public class Elevator {

    int departureFloor;
    int arrivalfloor;

    int elevatorNumber;

    public Elevator(int departureFloor, int arrivalfloor, int elevatorNumber) {
        this.departureFloor = departureFloor;
        this.arrivalfloor = arrivalfloor;
        this.elevatorNumber = elevatorNumber;
    }

    public int getDepartureFloor() {
        return departureFloor;
    }

    public int getArrivalfloor() {
        return arrivalfloor;
    }

    public int getElevatorNumber() {
        return elevatorNumber;
    }

    public void setElevatorNumber(int elevatorNumber) {
        this.elevatorNumber = elevatorNumber;
    }
}
