class teste{
    public static void main(String [] args){
        //System.out.println("Hello project");
        Caneta c1 = new Caneta();
        c1.tampada = false;
        c1.carga = 90;
        c1.cor = "azul";
        c1.modelo = "bic";

        Caneta c2 = new Caneta();
        c2.tampada = true;
        c2.carga = 90;
        c2.cor = "vermelha";
        c2.modelo = "bic";

        c1.rabiscar();
        c1.printOn();

        c2.rabiscar();
        c2.printOn();
        }
    
}