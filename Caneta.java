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
