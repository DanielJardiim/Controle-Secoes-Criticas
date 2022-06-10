package exemplosemaforo;
public class ExemploSemaforo {
    public static void main(String[] args) {
        //CRIANDO A FILA DA IMPRESSORA
        FilaImpressora fila = new FilaImpressora();
        
        //CRIANDO UM ARRAY DE 3 THREADS
        //COLOCANDO TODAS NA MESMA FILA
        Thread[] thread = new Thread[3];
        for (int i = 0; i < 3; i++) {
            thread[i] = new Thread(
                new ProcessoImpressora(fila)
            );
        }

        //DANDO START NAS THREADS
        for (int i = 0; i < 3; i++) {
            thread[i].start();
        }
    }   
}