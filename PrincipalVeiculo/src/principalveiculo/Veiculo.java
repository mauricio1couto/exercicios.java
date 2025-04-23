/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalveiculo;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private boolean motorLigado;
    private double combustivel;
    
    public Veiculo(){
    }
    
    public Veiculo(String marca , String modelo , int ano , double combustivel){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.combustivel = combustivel;
    this.motorLigado = false;
    this.velocidadeAtual = 0;
    }
    

    public void ligarMotor() {
        if (this.motorLigado) {
            System.out.println("O motor ja esta ligado");
        } else {
            this.motorLigado = true;
            System.out.println("Motor Ligado");
        }
    }

    public void desligarMotor() {
        if (this.motorLigado) {
            this.motorLigado = false;
            System.out.println("Motor esta desligado");
        } else {
            System.out.println("Motor esta desligado");
        }
    }

    public void acelerar() {
        if (this.motorLigado) {
            if (this.combustivel <= 0) {
                System.out.println("Sem combustivel");
            } else {
                this.velocidadeAtual = this.velocidadeAtual += 10;
                this.combustivel = this.combustivel = 0.5;
                System.out.println("a velocidade atual é " + this.velocidadeAtual);
            }
        } else {
            System.out.println("o motor esta ligado");
        }

    }
public void frear (){
    if(this.velocidadeAtual>0){
        this.velocidadeAtual -=10;
        if(this.velocidadeAtual < 0){
            this.velocidadeAtual =0;
        }
        System.out.println("Velocidade atual é " + this.velocidadeAtual);
    } else {
        System.out.println("O veiculo ja esta parado");
    }
} 

public void exibirInfo(){
    System.out.println("Marca" +this.marca);
    System.out.println("Modelo" +this.marca);     
    System.out.println("ano"+this.ano);
    System.out.println("Motor"+ (this.motorLigado? "Ligado" : "desligado"));
    if(this.motorLigado){
    System.out.println("motor ligado");
    } else {
        System.out.println("Motor desligado");
}
    System.out.println("Velocidade atual km/h"+this.velocidadeAtual);
    System.out.println("Quantidade de combustivel"+this.combustivel);

    }
}


/*

*/
