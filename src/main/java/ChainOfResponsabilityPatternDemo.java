public class ChainOfResponsabilityPatternDemo {

    private static Vehicle getChainOfLoggers(){
        Vehicle emailVehicle = new AstonMartin();
        Vehicle fileVehicle = new Ferrari();
        Vehicle consoleVehicle = new Lamborghini();
        emailVehicle.setNextVehicle(fileVehicle);
        fileVehicle.setNextVehicle(consoleVehicle);
        return emailVehicle;
    }


    public static void main(String[] args) {
        Vehicle vehicleChain = getChainOfLoggers();
        vehicleChain.print("Red Color");
        vehicleChain.print("Blue Color");
        vehicleChain.print("Black Color");
    }
}
