import java.util.Scanner;
    public class exercicio2 {
        public static void main(String[] args) {
            
        @SuppressWarnings("resource")
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("digite as hora Incial da reunião");
        int horaInicial = leitor.nextInt();
        System.out.println("digite os minutos iniciais da reunião");
        int minutosInicial = leitor.nextInt();
        System.out.println("digite as horas finais da reunião");
        int horaFinal = leitor.nextInt();
        System.out.println("digite os minutos finais da reunião");
        int minutosFinal = leitor.nextInt();

        int tempoInicial = (horaInicial*60)+minutosInicial;
        int tempoFinal = (horaFinal*60)+minutosFinal;
        int tempoTotal = horaInicial - horaFinal;
        int hora = tempoTotal /60;
        int minutos = tempoTotal%60;

        System.out.println("tempo total =" + hora + ":" +minutos );


    }
}
