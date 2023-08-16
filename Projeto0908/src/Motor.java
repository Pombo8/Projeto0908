
class Motor {
    private String tipo;
  
    private  int id;

    private static int proximoId=1;

    public String getTipo(){
        
        return tipo;
    }
    public int GetId(){
        return id;
    }
    public Motor(String tipo) {
        this.tipo = tipo;
        this.id = proximoId++;
    }
    public String toString(){
        return " || Tipo : "+tipo+" || Id= "+id;
    }
}