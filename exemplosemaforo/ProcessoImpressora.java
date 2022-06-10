package exemplosemaforo;
public class ProcessoImpressora implements Runnable{
    //FILA DA IMPRESSORA
    FilaImpressora fila;

    //RECEBENDO A FILA QUE A THREAD VAI DISPUTAR RECURSO
    public ProcessoImpressora(FilaImpressora f) {
        fila = f;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
        + " pronta para imprimir!");
        //fila.imprimirSemSemaforo();
        fila.imprimirComSemaforo();
    }
}