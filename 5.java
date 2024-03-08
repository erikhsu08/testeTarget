public class Main {
  public static void main(String[] args) {
    String palavra = "target";
    int tamanho = palavra.length();

    char[] resultado = new char[tamanho];

    for (int i = 0; i < tamanho; i++){
      resultado[i] = palavra.charAt(i);
    }

    int cont = 1; 
    
    for (int i = 0; i < tamanho / 2; i++){
        char aux = resultado[i];
        resultado[i] = resultado[tamanho-1-i];
        resultado[tamanho-1-i] = aux;
        cont += 2;
    
    }

    for (int i = 0; i < tamanho; i++){
      System.out.print(resultado[i]);
    }
  }

}
