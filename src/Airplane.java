public class Airplane {

    private String Brand;
    private int numOfSits;

    public Airplane (String Brand,
            int numOfSits) {
        this.Brand = Brand;
        this.numOfSits = numOfSits;
    }

    public String getBrand(){
            return this.Brand;
        }

    public int setNumOfSits(){
        return numOfSits;
    }


}


