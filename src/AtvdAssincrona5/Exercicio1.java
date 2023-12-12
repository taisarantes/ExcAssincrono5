package AtvdAssincrona5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub9
		ArrayList<String> cores = new ArrayList<String>();
		String corUsuario;
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite a %dª cor: ", i + 1);
			corUsuario = leia.nextLine();
			cores.add(corUsuario);
		}
		
		System.out.println("Lista de cores:");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		System.out.println("Lista de cores ordenadas:");
		Collections.sort(cores);
		for(String cor : cores) {
			System.out.println(cor);
		}

	}

}
