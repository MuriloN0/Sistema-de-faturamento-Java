/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faturamento;

/**
 *
 * @author muril
 */
public class Faturamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Produto prod1 = new Produto(10, "Mouse", 5, 3);
       prod1.calcularTotalVendido();
       System.out.println("total vendido:" + prod1.getTotalVendas());
    }
    
}
