public class Engine {
    private int prodYear;
    private int enginePower;

    public Engine (int prodYear, int enginePower ){
        this.prodYear = prodYear;
        this.enginePower = enginePower;
    }

    public int getEngineProdYear() {
        return prodYear;
    }

    public int getEnginePower() {
        return enginePower;
    }

    protected void isEngineEcological (){
        if (this.enginePower > 20000 && this.prodYear > 2000){
            System.out.println("is very ecofriendly");
        }
    }

}

