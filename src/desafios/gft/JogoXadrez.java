/*
* O jogo de xadrez possui várias peças com movimentos curiosos: uma delas é a dama,
* que pode se mover qualquer quantidade de casas na mesma linha, na mesma coluna,
* ou em uma das duas diagonais, conforme exemplifica a figura abaixo:
* Entrada
A entrada contém vários casos de teste. A primeira e única linha de cada caso de teste contém quatro inteiros
* X1, Y1, X2 e Y2 (1 ≤ X1, Y1, X2, Y2 ≤ 8). A dama começa na casa de coordenadas (X1, Y1), e a casa de destino
* é a casa de coordenadas(X2, Y2). No tabuleiro, as colunas são numeradas da esquerda para a direita de 1 a 8 e as linhas de cima para
* baixo também de 1 a 8. As coordenadas de uma casa na linha X e coluna Y são (X, Y ).

O final da entrada é indicado por uma linha contendo quatro zeros.

 */

package desafios.gft;

import java.util.Scanner;

public class JogoXadrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1,y1,x2,y2;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while(true){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
            if(x1 == x2 && y1 == y2)
                System.out.println("0");
            else if((x1 == x2) || (y1 == y2) || (Math.abs(x1-x2)) == (Math.abs(y1-y2)))
                System.out.println("1");
            else
                System.out.println("2");
        }
        sc.close();
    }
}
