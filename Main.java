import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrice = new int[3][3];
        Random random = new Random();
       
        for (int riga = 0; riga < 3; riga++){
            for (int colonna = 0; colonna < 3; colonna++){
                matrice[riga][colonna] = (int) (Math.random() * 10 + 1);
            }
        }
       
        System.out.println("Matrice:");
        for (int riga = 0; riga < 3; riga++){
            for (int colonna = 0; colonna < 3; colonna++){
                System.out.print(matrice[riga][colonna] + " ");
            }
            System.out.println();
        }
       
        int somma = calcolaSomma(matrice);
        System.out.println("Somma degli elementi: " + somma);
       
        int massimo = trovaMax(matrice);
        System.out.println("Valore massimo: " + massimo);
    }

    public static int calcolaSomma(int[][] matrice) {
        int somma = 0;
        for (int riga = 0; riga < 3; riga++){
            for (int colonna = 0; colonna < 3; colonna++){
                somma += matrice[riga][colonna];
            }
        }
        return somma;
    }

    public static int trovaMax(int[][] matrice) {
        int massimo = matrice[0][0];
        for (int riga = 0; riga < 3; riga++){
            for (int colonna = 0; colonna < 3; colonna++){
                if (matrice[riga][colonna] > massimo) {
                    massimo = matrice[riga][colonna];
                }
            }
        }
        return massimo;
    }
}
