public class Moto extends Veiculo implements RecursoEletrico {
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, Motor motor, boolean ligado, boolean partidaEletrica){
        super(marca, modelo, motor, ligado);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
    public String toString(){
        String pEletrica;
        if(partidaEletrica) pEletrica = "Possui";
        else pEletrica = "Nao Possui";
        return super.toString()+" || Partida Eletrica: "+pEletrica;
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
