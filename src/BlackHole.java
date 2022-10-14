public class BlackHole {
    private double mass;
    private double acceleration;
    private double velocity;
    private double deltaV;
    private double deltaS;

    public BlackHole(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getDeltaV() {
        return deltaV;
    }

    public void setDeltaV(double deltaV) {
        this.deltaV = deltaV;
    }

    public double getDeltaS() {
        return deltaS;
    }

    public void setDeltaS(double deltaS) {
        this.deltaS = deltaS;
    }
}
