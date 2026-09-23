public class PowerOutletApp {
    public static void main(String[] args) {
       
        Laptop lptp = new Laptop();
        PowerOutlet lptpAdapter = new LaptopAdapter(lptp);
       
        Refrigerator ref = new Refrigerator();
        PowerOutlet refAdapter = new RefrigeratorAdapter(ref);

        SmartPhoneCharger cp = new SmartPhoneCharger();
        PowerOutlet cpAdapter = new SmartphoneAdapter(cp);

        System.out.println(lptpAdapter.plugIn());
        System.out.println(refAdapter.plugIn());
        System.out.println(cpAdapter.plugIn());

    }
}