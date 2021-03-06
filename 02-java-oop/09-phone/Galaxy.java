public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String ring = getRingTone();
        return ring;
    }
    @Override
    public String unlock() {
        String unlock = getUnlock();
        return unlock;
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy" + getVersionNumber() + "from" + "getCarrier"());           
    }
}

