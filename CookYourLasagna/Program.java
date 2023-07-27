package br.com.CookYourLasagna;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("vamos preparar uma lasanha,digite quantas camadas ela vai ter: ");
		int preparation = sc.nextInt();

		System.out.println("a quanto tempo essa lasanha esta no forno? ");
		int remain = sc.nextInt();

		sc.close();
		
		Lasanha lasanha = new Lasanha(remain, preparation);

		System.out.println("tempo de preparo foi: " + lasanha.preparationTimeInMinutes(preparation));

		System.out.println("faltam " + lasanha.expectedMinutesInOven(remain) + " minutos no forno");

		System.out.println(
				"tempo total de preparo e no forno até agora é o total de: " + lasanha.tempogasto() + " minutos");
	}

}
