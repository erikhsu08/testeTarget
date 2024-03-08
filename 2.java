public class Main {
  public static void main(String[] args) {
    int n = 34; //numero que se deseja procurar
    int[] sequencia = criaSequencia(n);
    buscabinaria(n, sequencia);
  }

  static public int fibonacci(int n){
    if (n == 0 || n == 1){
      return n;
    }else{
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }

  static public int[] criaSequencia(int n){
    int[] sequencia = new int[n];
    
    //add valores na lista e printa
    System.out.println("Sequência fibonacci de tamanho " + n + ":");
    for (int i = 0; i < n; i++){
      sequencia[i] = fibonacci(i);
      System.out.println(sequencia[i]);
    }
    return sequencia;
  }

  static public void buscabinaria(int n, int sequencia[]){
    int inicio = 0;
    int tamanho = sequencia.length;
    int fim = tamanho-1;

    while(inicio < fim) {
      int meio = (inicio + fim) / 2;
      if (sequencia[meio] == n){
        System.out.println("O número " + n + " faz parte da sequência fibonacci!");
        return;
      } else if (n < sequencia[meio]){
        fim = meio - 1;
      } else {
        inicio = meio + 1;
      }
    }
    System.out.println("O número " + n + " não faz parte da sequência fibonacci!");
  }
}




