# 🛠️ Merge Sort - Documenração

![gif explicativo de um algoritmo Merge sort ](https://www.crio.do/blog/content/images/2021/12/Merge-Sort.gif)


## 📋 O Pseudo Código:
```
1. Se o array tiver 1 ou nenhum elemento, ele já está ordenado. Retorne-o.
2. Divida o array em dois subarrays:
   - Esquerdo: da posição inicial até o meio.
   - Direito: do meio até o final.
3. Recursivamente, aplique o Merge Sort nos subarrays esquerdo e direito.
4. Combine (merge) os dois subarrays ordenados:
   - Compare os elementos de ambos os subarrays.
   - Adicione o menor elemento ao array resultante.
   - Adicione os elementos restantes de ambos os subarrays ao array resultante.
5. Retorne o array ordenado.
```
---
## 📝 Descrição do Algoritmo
O Merge Sort é um algoritmo de ordenação baseado no paradigma Dividir e Conquistar. Ele divide o array em subarrays menores, ordena cada subarray e, em seguida, combina (merge) os subarrays ordenados para formar o array final ordenado.

### ✨ Características do Merge Sort
Complexidade de Tempo: O(n log n) no pior, melhor e caso médio.
Estável: Mantém a ordem relativa dos elementos iguais.
Não in-place: Requer espaço adicional para armazenar os subarrays.
---
## 🔍 Como Funciona o Merge Sort?
### 1 - Divisão 🪓:

O array (vetor) é dividido recursivamente em dois subarrays de tamanhos aproximadamente iguais até que cada subarray tenha apenas um elemento.

### Exemplo: 

Considere o array {5, 8, 4, 1, 6}:

ele será dividido em:

{5, 8} e {4, 1, 6}

{5} e {8} e {4} e {1, 6} 

{1} e {6}

### 2 - Conquista (Ordenação e Combinação) 🧩:

Os subarrays são combinados (merge) de forma ordenada.

Durante a combinação, os elementos de dois subarrays são comparados e o menor elemento é adicionado ao array resultante.

{5} e {8} são combinados para formar {5, 8}.

### 3 - Resultado Final 🏁:

Após todas as combinações, o array original estará ordenado.

{5, 8, 4, 1, 6} → {1, 4, 5, 6, 8}.

---
## 🚀 Instruções para Executar o Código

### ✅ Pré-requisitos
Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.

Um editor de texto ou IDE como IntelliJ IDEA, Eclipse ou VS Code.

### 🛠️ Passos para Executar

### 1 -Crie um Arquivo Java:
Salve o código fornecido em um arquivo chamado Main.java.

### 2 - Compile o Código:
Abra o terminal e navegue até o diretório onde o arquivo Main.java está salvo.

Execute o comando:
```bash
javac Main.java
```
### 3 - Execute o Código:
Após a compilação, execute o programa com o comando:

```bash
java Main
```
### 4 - Saída Esperada:
O programa imprimirá o array original e o array ordenado no console.

> Random numbers: [5, 8, 4, 1, 6, 9, 7, 4, 2, 3]

> Sorted numbers: [1, 2, 3, 4, 4, 5, 6, 7, 8, 9]
---
## 💻 Exemplo de Uso

### Entrada
> int[] randomNumbers = {5, 8, 4, 1, 6, 9, 7, 4, 2, 3};

### Saída

> Sorted numbers: [1, 2, 3, 4, 4, 5, 6, 7, 8, 9]
---
## 🔍 Explicação do Código
### 1 - Função mergeSort:

Divide o array em dois subarrays menores.
Chama a si mesma recursivamente para ordenar os subarrays.
Combina os subarrays ordenados usando a função merge.

### 2 - Função merge:

Recebe dois arrays ordenados como entrada.
Compara os elementos de ambos os arrays e adiciona o menor elemento ao array resultante.
Adiciona os elementos restantes de ambos os arrays ao array resultante.

### 3 - Função main:

Define o array de números aleatórios.
Chama a função mergeSort para ordenar o array.
Imprime o array original e o array ordenado.
---
## 🌟 Vantagens do Merge Sort

Ideal para grandes conjuntos de dados devido à sua complexidade de tempo eficiente.

Funciona bem em dados que não cabem na memória principal, pois pode ser implementado para trabalhar com dados externos.

---
## ⚠️ Limitações

Requer espaço adicional proporcional ao tamanho do array, o que pode ser uma desvantagem em sistemas com memória limitada.

---
## Fontes:

### Para escrever esse README.md, consultamos as seguites fontes:
#### Documentos:
>https://docs.github.com/pt/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax

> https://joaoarthurbm.github.io/eda/posts/merge-sort/

> https://www.w3schools.com/dsa/dsa_algo_mergesort.php

#### Vídeos:
> https://www.youtube.com/watch?v=BnsYGiYYdnQ

> https://www.youtube.com/watch?v=5prE6Mz8Vh0