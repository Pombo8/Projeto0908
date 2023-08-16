public class Carro extends Veiculo implements RecursoEletrico{
    private int numPortas;

    public Carro(String marca, String modelo, Motor motor, boolean ligado, int numPortas) {
        super(marca, modelo, motor, ligado);
        this.numPortas = numPortas;
        
    }

    @Override
    public void ligar(){
        if(getLigado()) System.out.println("\nJa esta ligado");
        else{ System.out.println("\nCarro ligado");
            setLigado(true);
        }
    }
    public String toString(){
        return super.toString() +" || N. Portas: "+numPortas;
    }

    @Override
    public void ligarEletrico() {
        System.out.println("Ligou eletrico");
        
    }

    @Override
    public void desligarEletrico() {
        System.out.println("Desligou eletrico");
        
    }

}
