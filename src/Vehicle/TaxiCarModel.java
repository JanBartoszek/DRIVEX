package Vehicle;

import Road.RoadModel;

import static Vehicle.CarController.CarModels.TAXI;

public class TaxiCarModel extends Vehicle {

    /* constructor */
    public TaxiCarModel(RoadModel roadWithThisCar) {
        super(roadWithThisCar);
        speedMax = 0.3;
        speedActual = speedMax;
        carEnum = TAXI;
    }

    @Override
    protected void slowDown() {
//TODO
    }

    @Override
    protected void speedUp() {
//TODO
    }

}
