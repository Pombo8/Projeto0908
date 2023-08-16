public class App{
    public static void main (String[] args){
        Motor mt1 = new Motor("V6");
        Motor mt2 = new Motor("600cc");
        Motor mt3 = new Motor("V8w350");
        
        //carro
        Carro car1 = new Carro("Toyota","Corolla 2001",mt1,false,4);
        System.out.println(car1);
        
        //moto
        Moto moto1 = new Moto("Yamaha", "XP200",mt2 ,false, true);
        System.out.println(moto1);

        car1.desligar();
        car1.ligar();
        car1.ligar();
        
        System.out.println( mt1.GetId());
        System.out.println( mt2.GetId());
        System.out.println( mt3.GetId());
        moto1.desligarEletrico();


    }
}