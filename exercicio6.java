import java.util.Scanner;
public class exercicio6 {    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite seu peso em kg");
        int peso = leitor.nextInt();
        System.out.println("digite a sua altura");
        int altura = leitor.nextInt();
        int imc = leitor.nextInt();

        int kg = 1000/peso;
        int al = 1000/altura;
        int imcc = kg/al;
        if (imcc < 18.5){
            System.out.println("abaixo do peso");
        }
         if (imcc > 18.5 && imcc < 25);
            System.out.println("peso normal");
        if (imcc > 25 && imcc < 30){
            System.out.println("acima do peso");
        }
         if(imcc >= 30);
            System.out.println("obeso");
        System.out.println("seu imc é igual"+ imcc);

      
    }
}             