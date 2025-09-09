public class Car {
    int myStartMiles;
    int myEndMiles;
    double myGallonsUsed;
    int odometerReading;
    public Car(){
    }
    public Car(int odometerReading){
        this.myStartMiles = odometerReading;
        this.odometerReading = odometerReading;
    }
    void fillUp(int odometerReading, double gallons){
        this.myGallonsUsed+=gallons;
        this.myEndMiles=odometerReading;
        this.odometerReading = odometerReading;
    }

    double calculateMPG(){
        double miles = this.myEndMiles-this.myStartMiles;
        double mpg = miles/this.myGallonsUsed;
        return mpg;
    }

    void resetMPG(){
        this.myGallonsUsed=0.0;
        this.myStartMiles=this.odometerReading;
    }
    
}
