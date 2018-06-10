public class ATMProxy implements GetATMData {

    private GetATMData atmMachine;

    public ATMProxy(GetATMData atmMachine){
        this.atmMachine = atmMachine;
    }

    public int getCashInMachine() {
        return atmMachine.getCashInMachine();
    }
}