package Taxas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	MortalidadeNatalidade  alg = new MortalidadeNatalidade();

     System.out.println("Digite o número de habitantes");
     float numHabitantes  = teclado.nextFloat();

     System.out.println("Digite qual taxa você quer ver");

     System.out.println("1-Natalidade");
     System.out.println("2-Mortalidade");
     byte opcao = teclado.nextByte();

     switch(opcao) {
     case 1:
         System.out.println("Digite o número de nascimentos");
         float numNascidos  = teclado.nextFloat();
         System.out.printf("A taxa de natalidade é %.2f",alg.natalidade(numNascidos, numHabitantes));
         break;
     case 2:
         System.out.println("Digite o número de óbitos");
         float numObito  = teclado.nextFloat();
         System.out.printf("A taxa de mortalidade é %.2f",alg.mortalidade(numObito, numHabitantes));
         break;
     default:
         System.out.println("Operação inválida");
     }
 }
}