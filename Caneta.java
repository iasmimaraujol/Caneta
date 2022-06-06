/*
 * //! Autor: Iasmim Araujo
 * //
 * //? in english
 * This project is only to review OOP
 * The idea is create a program that do common activities from a pen.
 * //? in português
 * Esse é um projeto apenas para revisão do Paradigma de orientação a objeto (POO)
 * A ideia é criar um programa que faça as atividades comuns de uma caneta
 */
public class Caneta {
    //declaracoes
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    //construtor
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.carga = 100;
        this.tampada = true;
    }

    //modificadores
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float ponta){
        this.ponta = ponta;
    }

    //metodos
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
    private void tampar(){
        this.tampada = true;
    }
    private void destampar(){
        this.tampada = false;        
    } 

}
