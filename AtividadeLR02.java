//02 - Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
package la�osRepeti��o;

import java.util.Scanner;

public class AtividadeLR02 {

	public static void main(String[] args) {
  
		Scanner leia = new Scanner(System.in);

      int contador,num,par = 0,impar = 0;

      for(contador = 0;contador < 10; contador++) {
          System.out.println("Digite um n�mero: ");
          num = leia.nextInt();
          
          if(num % 2 == 0) {
          	par++;         }
          else {
          	impar++;
          }
            
  }
      System.out.println("A quantidade de n�meros pares �: " + par);
      System.out.println("A quantidade de n�meros impares �: " + impar);

	}

}
