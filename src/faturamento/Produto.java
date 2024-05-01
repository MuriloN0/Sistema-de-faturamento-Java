/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faturamento;

/**
 *
 * @author muril
 */
public class Produto {
    private int codigo;
    private String descricao;
    private double valorUnitario;
    private double quantidadeVendida;
    private double totalVendas;
    
    //constructor
    
    public Produto( int codigo, String descricao, double valorUnitario, double quantidadeVendida){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidadeVendida = quantidadeVendida; 
    }
    
    // metodos de acesso
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    
    public void setValorUnitario(double valorUnitario){
        this.valorUnitario = valorUnitario;
    }
    public double getValorUnitario(){
        return valorUnitario;
    }
    
    public void setQuantidadeVendida(double quantidadeVendida){
        this.quantidadeVendida = quantidadeVendida;
    }
    public double getQuantidadeVendida(){
        return quantidadeVendida;
    }
    
    public double getTotalVendas(){
        return totalVendas;
    }
    
    public void calcularTotalVendido(){
        totalVendas = valorUnitario * quantidadeVendida;
    }
}


