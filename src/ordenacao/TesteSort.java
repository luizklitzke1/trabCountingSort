//Alunos: Arthur B. Pinotti, Luiz G. Klitzke, Nadir J. Rafagnim

package ordenacao;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class TesteSort 
{
	@Test
	void testeHardcoded() 
	{
		int arrayPositivos[] = {4, 5, 2, 1, 8, 22, 3, 44, 2, 3, 4, 55};
		System.out.print("\nVetor hardcoded de positivos desordenado: ");
		
		for (int i = 0; i < arrayPositivos.length; ++i) 
			System.out.print(arrayPositivos[i]+ " ");
		
		CountingSort.sort(arrayPositivos);
		System.out.print("\nVetor hardcoded de positivos ordenado: ");
		
		for (int i = 0; i < arrayPositivos.length - 1; ++i)
		{
			System.out.print(arrayPositivos[i]+ " ");
			assertEquals(true, arrayPositivos[i] <= arrayPositivos[i + 1]);
		}
		
		int arrayInteiros[] = {90, 22, -8, -3, 15, 22, 8, -12, 6, 3, -3, 21, 15, 10, 15, -15, 2, 3};
		System.out.print("\nVetor hardcoded de positivos e negativos desordenado: ");
		for (int i = 0; i < arrayInteiros.length; ++i) 
			System.out.print(arrayInteiros[i]+ " ");
		
		
		CountingSort.sort(arrayInteiros);;
		System.out.print("\nVetor hardcoded de positivos ordenado: ");
		
		for (int i = 0; i < arrayInteiros.length - 1; ++i)
		{
			System.out.print(arrayInteiros[i]+ " ");
			assertEquals(true, arrayInteiros[i] <= arrayInteiros[i + 1]);
		}
	}
	
	@Test
	void testeAleatorios()
	{
		Random random = new Random();
		
		//Cria vetor de 0 - 1000 valores aletórios entre -999 e 999
		int tamanhoMinArr = 0;
		int tamanhoMaxArr = 1000;
		int tamanhoArrayRandom = random.nextInt(tamanhoMaxArr - tamanhoMinArr) + tamanhoMinArr;
	
		int arrayValoresAleatorios[] = new int[tamanhoArrayRandom];
	    
		System.out.print("\nVetor aleatorio de " + tamanhoArrayRandom + " elementos desordenado: ");
		
		for (int i = 0; i < tamanhoArrayRandom; ++i)
		{
			arrayValoresAleatorios[i] = random.nextInt(999 + 999) - 999;
			System.out.print(arrayValoresAleatorios[i] + " ");
		}
		
		System.out.print("\nVetor orndenado: ");
		CountingSort.sort(arrayValoresAleatorios);
		
		
		for (int i = 0; i < arrayValoresAleatorios.length - 1; ++i)
		{
			System.out.print(arrayValoresAleatorios[i]+ " ");
			assertEquals(true, arrayValoresAleatorios[i] <= arrayValoresAleatorios[i + 1]);
		}
	}

}
