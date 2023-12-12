package AtvdAssincrona5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numeros = new HashSet<Integer>();
		int numUsuario;
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº numero: ", i + 1);
			numUsuario = leia.nextInt();
			numeros.add(numUsuario);
		}
		
		System.out.println("Numeros ordenados: ");
		Iterator<Integer> iNumeros = numeros.iterator();
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

	}

}
