public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    protected boolean tampada;
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("não dá para rabiscar!");
        }else{
            System.out.println("dá para riscar!");
        }
    }
    public void printOn(){
        System.out.println(this.tampada);
        System.out.println(this.carga);
        System.out.println(this.cor);
        System.out.println(this.modelo);
        System.out.println(this.ponta);
        System.out.println("-------------------------------");
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;        
    }    
}
