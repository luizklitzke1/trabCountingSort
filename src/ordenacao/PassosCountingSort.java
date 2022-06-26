//Alunos: Arthur B. Pinotti, Luiz G. Klitzke, Nadir J. Rafagnim

package ordenacao;
import java.util.Arrays;

public class PassosCountingSort {
	public void sort(int array[])
    {
        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;
        int quantidadeValores = array.length;
        //Procura o menor e maior valor
        for (int i = 0; i < quantidadeValores; i++)
        {
            menorValor = Math.min(menorValor, array[i]);
            maiorValor = Math.max(maiorValor, array[i]);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Primeiro passo, encontrar o menor valor:");
        System.out.println(menorValor);
        System.out.println("------------------------------------------------------------");
        System.out.println("Segundo passo, encontrar o maior valor:");
        System.out.println(maiorValor);
        System.out.println("------------------------------------------------------------");
        //Cria um vetor para a contagem, do mesmo tamanho do range encontrado
        int arrayContagem[] = new int[maiorValor - menorValor + 1];
        System.out.println("Terceiro passo, criar vetor com o mesmo tamanho da faixa de valores acima + 1:");
        System.out.println("O '+1' eh para poder abrigar o maior número encontrado");
        System.out.println("Neste exemplo de -5 a +20");
        System.out.println("Novo array:");
        for (int i = 0; i < arrayContagem.length; i++) {
            System.out.print(i+"[]" + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------");
        //Passa pelo array original fazendo a contagem
        for (int i = 0; i < quantidadeValores; i++) {
            arrayContagem[array[i] - menorValor]++;
        }

        System.out.println("Quarto passo, conta as ocorrências de cada número registrando no array criado");
        for (int i = 0; i < arrayContagem.length; i++) {
            System.out.print(i+"["+ arrayContagem[i]+"]" + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------");
        //Altera os valores no array recebido para estarem ordenados
        System.out.println("Quinto passo, faz as alteracoes no array recebido:");
        System.out.println("Eh utilizado um contador para avançar no indice do array original");
        System.out.println("o laço interno evita que entre no array de contagem quando este estiver zerado, avançando apenas nos indices que tem contagens");
        int idxOrdenado = 0;
        for (int i = 0; i < arrayContagem.length; ++i)
        {
            for (int j = 0; j < arrayContagem[i]; ++j)
            {
                array[idxOrdenado] = menorValor + i;
                System.out.println("Indice array de contagem: " + i + " | " +  "quantidade em cada um destes indices: " + (j + 1));
                System.out.println("arrayOriginal " + idxOrdenado +"[] = menorValor("+ menorValor +") + indice array de contagem(" + i + ") | resultado = arrayOriginal "
                        + idxOrdenado + "[" + array[idxOrdenado] + "]");
                ++idxOrdenado;
                System.out.println("Array neste momento " +Arrays.toString(array));
            }
        }
    }
}
