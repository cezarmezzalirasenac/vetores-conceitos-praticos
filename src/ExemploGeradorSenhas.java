import java.security.SecureRandom;
import java.util.Arrays;

/**
 * 1- No nosso dia a dia, o uso de senhas
 * é algo comum, pois usamos muitos
 * sistemas ou aplicativos diferentes.
 * Como recomendação de segurança,
 * é necessário que para cada aplicativo
 * que usamos, seja gerada uma senha
 * segura.
 * Usando a técnica de arrays, gere 5
 * senhas que contenham pelo menos
 * 10 caracteres, contendo pelo menos 5
 * letras, sendo 3 maiúsculas e 3
 * minúsculas, 3 números e um
 * caractere especial (ponto, hashtag, barra,
 * ponto de interrogação, arroba).
 */

public class ExemploGeradorSenhas {
  public static void main(String[] args) {
    String[] senhas = new String[5];
    SecureRandom random = new SecureRandom();
    for (int i = 0; i < senhas.length; i++) {
      // 3 letras maiusculas [A-Z]
      // 3 letras minusculas [a-z]
      // 3 numeros [0-9]
      // 1 caractere especial ['.', '#', '/', '?', '@']
      char[] letrasMaiusculas = new char[3];
      for (int index = 0; index < 3; index++) {
        letrasMaiusculas[index] = (char) random.nextInt(65, 90);
      }

      char[] letrasMinusculas = new char[3];
      for (int index = 0; index < 3; index++) {
        letrasMinusculas[index] = (char) random.nextInt(97, 122);
      }

      // gerar os números
      // gerar o caracter especial
      senhas[i] = String.valueOf(letrasMaiusculas)
          .concat(String.valueOf(letrasMinusculas));
    }

    System.out.println("Senhas: " + Arrays.toString(senhas));
  }
}
