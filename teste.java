/* 
 * //! Autor: Iasmim Araujo
 * //! Data: 05/06/2022
 * //? in english
 * This project is only to review OOP
 * The idea is create a program that do common activities from a pen.
 * //? em português
 * Esse é um projeto apenas para revisão do Paradigma de orientação a objeto (POO)
 * A ideia é criar um programa que faça as atividades comuns de uma caneta
 */
class teste{
    public static void main(String [] args){
        //System.out.println("Hello project");
        Caneta c1 = new Caneta("Bic", "azul", 0.5f);
        Caneta c2 = new Caneta("Castle", "red", 1.5f);
        
        c1.printOn();
        c2.printOn();

        c1.rabiscar();
        c1.printOn();
        
        c1.rabiscar();
        c1.rabiscar();
        c1.rabiscar();
        c1.rabiscar();
        c1.rabiscar();
        c1.rabiscar();
        c1.rabiscar();
        c1.rabiscar();
        c1.rabiscar();
        c1.printOn();
        }    
}