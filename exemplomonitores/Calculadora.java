package exemplomonitores;

public class Calculadora {
    //VARIAVEL QUE VAI GUARDAR A SOMA
    private int soma;

    //MÉTODO QUE FAZ UMA SOMA
    public synchronized int somaArray(int[] array) {  //synchronized - torna somaArray() um monitor
        soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma = soma + array[i];

            System.out.println("Executando a soma "
            + Thread.currentThread().getName()
            + " - Somando o valor " + array[i]
            + " com o total de " + soma);
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {}
        }
    return soma;
    }
}