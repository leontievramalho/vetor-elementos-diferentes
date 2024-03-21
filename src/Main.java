import java.util.Set;

public class Main {
    public static void main(String[] args){
        int[] numeros = new int[10];
        numeros[0] = 12;
        numeros[1] = -1;
        numeros[2] = 3;
        numeros[3] = 7;
        numeros[4] = 11;
        numeros[5] = 10;
        numeros[6] = 13;
        numeros[7] = 9;
        numeros[8] = 43;
        numeros[9] = 8;
        exibirVetor(numeros);
        System.out.println("é todo diferente? " + todoDiferente(numeros));
    }

    public static void exibirVetor(int[] vetor){
        System.out.print("[");
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
        System.out.println("]");
    }

    public static boolean todoDiferente(int[] vetor){
        for(int i = 0; i<vetor.length; i++){
            for(int j = i+1; j<vetor.length; j++){
                if(vetor[i] == vetor[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
