/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Cidade {

    public String cidadeTime1;
    public String cidadeTime2;
    public String cidadeEstadio;
    private String deslocamentoEstadio;

    public Cidade(String aCddTime1, String aCddTime2, String aCddEstadio, String aDeslocEstadio) {
        this.cidadeTime1 = aCddTime1;
        this.cidadeTime2 = aCddTime2;
        this.cidadeEstadio = aCddEstadio;
        this.deslocamentoEstadio = aDeslocEstadio;
        
        
        
    }
    
    
    public void Cidades(){
       Scanner ler = new Scanner (System.in);
        
        System.out.println("Informe a cidade do Time 1: ");
        cidadeTime1 = ler.nextLine();
        System.out.println("Informe a cidade do Time 2: ");
        cidadeTime2 = ler.nextLine();
        System.out.println("Informe a cidade do Estádio: ");
        cidadeEstadio = ler.nextLine();
        
        System.out.println("A cidade do Time 1 é: "+cidadeTime1);
        System.out.println("A cidade do Time 2 é: "+cidadeTime2);
        System.out.println("A cidade do Estádio é: "+cidadeEstadio);
    }
    

    public String getDescricaoCidade() {
        return cidadeEstadio;
    }

}