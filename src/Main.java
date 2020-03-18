public class Main {
    public static void main(String []args){
        Airplane my = new Airplane("boi", 3 );
        Engine lol = new Engine(2002, 50000);

        String AirplaneBrand = my.getBrand();
        int airplaneSits = my.setNumOfSits();
        int engineProdYear = lol.getEngineProdYear();
        int enginePower = lol.getEnginePower();

        System.out.println("Plane namen est " +  AirplaneBrand + ", sitt amount is " + airplaneSits + ", year of production is "+  engineProdYear + ", pawARRR is " + enginePower);
        lol.isEngineEcological();




    }
}
