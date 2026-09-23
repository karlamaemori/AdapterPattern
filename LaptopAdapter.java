public class LaptopAdapter implements PowerOutlet {
    private Laptop lptp;
    
    public LaptopAdapter(Laptop lptp){
        this.lptp = lptp;
    } 

    @Override
    public String plugIn() {
        return lptp.charge();
    }
}