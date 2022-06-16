public class DragonFly implements Drone {

    private float maxEnergy = 100;

    private float energy ;

    private float  moementCount=0;



    private float energyDelta=1;


    @Override
    public float energyLevel() {
        energy= maxEnergy;
        return energy;
    }

    @Override
    public void recharge() {
            energy= maxEnergy;
        System.out.println("la bateria es recargada"+energy);
    }

    @Override
    public void move() {
           maxEnergy=maxEnergy-energyDelta;
        System.out.println("el movimiento realizado " +maxEnergy);


    }

    @Override
    public String status() {
        System.out.println("El vehiculo  234 " +energyLevel()+ " ");
        return null;
    }

    @Override
    public void returnHome() {

    }
    @Override
    public String toString() {
        return "DragonFly{" +
                "maxEnergy=" + maxEnergy +
                ", energy=" + energyLevel() +
                ", moementCount=" + moementCount +
                ", energyDelta=" + energyDelta +
                '}';
    }
}
