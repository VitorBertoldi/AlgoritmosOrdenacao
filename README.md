Algoritmos de Ordenação em Java

Este projeto implementa três algoritmos de ordenação em Java: Bubble Sort, Insertion Sort e Quick Sort. O objetivo é ordenar um array de entrada fornecido utilizando cada um desses algoritmos. O código inclui feedback visual, imprimindo o estado do array a cada iteração.

Algoritmos de Ordenação Implementados:

Bubble Sort

O Bubble Sort é um algoritmo de ordenação simples que percorre repetidamente a lista, comparar elementos adjacentes e os troca se estiverem na ordem errada. Esse processo é repetido até que nenhum swap seja necessário, indicando que a lista está ordenada.

Funcionamento:

Percorre a lista comparando elementos adjacentes.
Troca os elementos se estiverem na ordem errada.
Repete esse processo até que nenhum swap seja necessário.

Insertion Sort:

O Insertion Sort é um algoritmo que constrói uma sequência ordenada de elementos um de cada vez. Ele pega um elemento da lista e o insere na posição correta, deslocando os elementos maiores para abrir espaço.

Funcionamento:

Inicia com uma lista considerada ordenada.
Para cada elemento não ordenado, compara com os elementos ordenados e os desloca para a direita até encontrar a posição correta.

Quick Sort:


O Quick Sort é um algoritmo de ordenação eficiente e de divisão e conquista. Ele escolhe um elemento como pivô e particiona o array ao redor do pivô. Os elementos menores que o pivô são movidos para a esquerda, e os maiores, para a direita. O processo é aplicado recursivamente nas duas partições.
OBS. Pivô utilizado no Quick Sort: Neste código, o pivô utilizado é o último elemento do array.

Funcionamento:

Temos que dae escolher um elemento como pivô.
Dae assim é particionado o array ao redor do pivô, fazendo que pode mover elementos menores para a esquerda e, assim, maiores para a direita.
Aplica recursivamente o processo nas partições resultantes.

Utilização

O método principal (Main) instancia objetos das classes de cada algoritmo, fornece o array de entrada e imprime o estado inicial e final do array após a ordenação.

public static void main(String[] args) {
    int arr[] = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

    BubbleSort bubbleSort = new BubbleSort();
    InsertionSort insertionSort = new InsertionSort();
    QuickSort quickSort = new QuickSort();

    System.out.println("Array inicial");
    for(int i=0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();

    insertionSort.insertionSort(arr);

    System.out.println("Array depois do sort");
    for(int i=0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}

Feedback Visual

Durante o processo de ordenação, o código imprime o estado do array a cada iteração, proporcionando uma visão clara de como os elementos estão sendo rearranjados.

Compilação e Execução

Certifique-se de ter um ambiente Java configurado. Compile e execute o programa utilizando um ambiente de desenvolvimento integrado (IDE) ou através da linha de comando, como essa a seguir:

javac Main.java
java Main

Observações

O array de entrada não é alterado para garantir consistência na avaliação e facilitar a correção.
O Quick Sort utiliza o último elemento como pivô, conforme solicitado no enunciado.
Sinta-se à vontade para experimentar diferentes algoritmos de ordenação e observar como eles se comportam para este conjunto específico de dados.

