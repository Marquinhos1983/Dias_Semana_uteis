package Dias_Semana_Usando_Switch;

import java.util.*;

public class Dias_Semana_Usando_Switch {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Veja os dias da semana abaixo:");
		System.out.println("===============================");		
		System.out.println(" 1) Será a Segunda Feira.");
		System.out.println(" 2) Será a Terça Feira.");
		System.out.println(" 3) Será a Quarta Feira.");
		System.out.println(" 4) Será a Quinta Feira.");
		System.out.println(" 5) Será a Sexta Feira.");
		System.out.println("===============================");
		
		System.out.print("Qual dia util da semana você quer? ");
		int num = in.nextInt();
		
		switch (num) {
		case 1: System.out.println("Você escolheu a segunda feira.");
		break;
		case 2: System.out.println("Você escolheu a Terça feira.");
		break;
		case 3: System.out.println("Você escolheu a Quarta feira.");
		break;
		case 4: System.out.println("Você escolheu a Quinta feira.");
		break;
		case 5: System.out.println("Você escolheu a Sexta feira.");
		break;
		default: System.out.println("Número inválido, é entre 1 e 5, por favor.");
		}
	}
}
