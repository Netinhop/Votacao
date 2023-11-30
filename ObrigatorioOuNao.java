
package Votacao;
import java.util.Scanner;   

public class ObrigatorioOuNao {

    public static void main(String[] args) {
    System.out.print("Quer saber se é obrigatorio o seu voto para presidente? Me fale o ano que nasceu!");
    try (Scanner t = new Scanner(System.in)) {
        int nasc = t.nextInt();
        int i = 2023 - nasc;
        if (i<16){
            System.out.println("Não vota");
        } else {
        if ((i>=16 && i<18)||(i>70)){
            System.out.print("Opcional");
        } else {
            System.out.print("Obrigatorio");       
        }
         }
    }
    }
    
}
