public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String ring =getRingTone();
        Return ring;
    }
    @Override
    public String unlock() {
        String unlock = getUnlock();
        return "unlock with Finger print"
    }
    @Override
    public void displayInfo() {
        System.out.println("Iphone" + getVersionNumber() + "from" + getCarrier());          
    }
}

