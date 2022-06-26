//Alunos: Arthur B. Pinotti, Luiz G. Klitzke, Nadir J. Rafagnim

package ordenacao;

public class CountingSort 
{
    public void sort(int array[]) 
    {
    	int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;
        int quantidadeValores = array.length;
        
        //Procura o menor e maior valor
        for (int i = 0; i < quantidadeValores; ++i) 
        {
            menorValor = Math.min(menorValor, array[i]);
            maiorValor = Math.max(maiorValor, array[i]);
        }

        //Cria um vetor para a contagem, do mesmo tamanho do range encontrado
        int arrayContagem[] = new int[maiorValor - menorValor + 1];

        //Passa pelo array original fazendo a contagem
        for (int i = 0; i < quantidadeValores; ++i)
        	arrayContagem[array[i] - menorValor]++;

        //Altera os valores no array recebido para estarem ordenados utilizando o vetor de contagem
        int idxOrdenado = 0;
        
        for (int i = 0; i < arrayContagem.length; ++i)
        {
        	for (int j = 0; j < arrayContagem[i]; ++j)
        	{
        		array[idxOrdenado] = menorValor + i;
        		++idxOrdenado;
        	}
        }
    }
}
