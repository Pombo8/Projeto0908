
/**
 *
 * @author ht301410x
 */
public abstract class Veiculo {
    private String marca;
    private String modelo; 
    private Motor motor;
    private boolean ligado;

    public boolean getLigado(){
        return ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void ligar(){ 
        if(!ligado){
        System.out.print("\nVeiculo ligado");
        
        this.ligado = true;
        }
        else System.out.print("\nJa esta ligado");
    }
    public void desligar(){
        if(ligado){
            this.ligado = false;
            System.out.print("\nVeiculo desligado");
        }
        else System.out.print("\nVeiculo ja esta desligado");
    }
    @Override
    public String toString(){
        return "\nMarca: "+marca+" || Modelo: "+modelo+" || Motor: "+motor+" || Ligado: "+ligado;
    }
    public Veiculo(String marca, String modelo, Motor motor, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.ligado = ligado;
    }
    
    
}
