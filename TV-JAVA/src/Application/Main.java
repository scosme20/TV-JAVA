package Application;
import Entities.Logic;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja ligar a televisão? (sim/não)");
        String opcao = sc.next();

        Logic tv = new Logic(false, 1, 10);

        if(opcao.equalsIgnoreCase("sim")) {
            tv.ligada();
            System.out.println("A televisão está ligada.");

            boolean continuar = true;
            while (continuar) {
                System.out.println("Deseja mudar o canal? (sim/não)");
                String mudar = sc.next();

                while(mudar.equalsIgnoreCase("sim")) {
                    System.out.println("Digite o número do canal:");
                    int canal = sc.nextInt();
                    tv.selecionarCanal(canal);

                    System.out.println("TV no canal " + tv.getCanal());

                    System.out.println("Deseja mudar o canal novamente? (sim/não)");
                    mudar = sc.next();
                }

                System.out.println("Deseja ajustar o volume? (sim/não)");
                String verificarV = sc.next();

                while (verificarV.equalsIgnoreCase("sim")) {
                    System.out.println("Aumentar ou diminuir? (aumentar/diminuir)");
                    String som = sc.next();
                    if (som.equalsIgnoreCase("aumentar")) {
                        System.out.println("Digite o valor para aumentar o volume:");
                        int volume = sc.nextInt();
                        tv.aumentarVolume(volume);
                    } else if (som.equalsIgnoreCase("diminuir")) {
                        System.out.println("Digite o valor para diminuir o volume:");
                        int volume = sc.nextInt();
                        tv.abaixarVolume(volume);
                    }

                    System.out.println("Deseja verificar o volume novamente? (sim/não)");
                    verificarV = sc.next();
                }
                System.out.println("Deseja desligar a televisão? (sim/não)");
                String desligar = sc.next();
                if (desligar.equalsIgnoreCase("sim")) {
                    tv.desligada();
                    System.out.println("A televisão está desligada.");
                    continuar = false;
                } else {
                    System.out.println("TV no canal " + tv.getCanal() + " com volume " + tv.getVolume());
                }
            }

        } else {
            System.out.println("A televisão está desligada.");
        }

        sc.close();
    }
}
