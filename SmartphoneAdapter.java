public class SmartphoneAdapter implements PowerOutlet {
    private SmartPhoneCharger cp;

    public SmartphoneAdapter(SmartPhoneCharger cp) {
        this.cp = cp;
    }

    @Override 
    public String plugIn() {
        return cp.chargePhone();
    }
}