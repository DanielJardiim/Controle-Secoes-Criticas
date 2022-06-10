package exemplomonitores;

public class ExemploMonitor {
    public static void main(String[] args) {
        //CRIANDO ARRAYS DE INPUTS
        int[] sInputs1 = {10,20,30,40};  //100
        int[] sInputs2 = {10,20,30,40,50};  //150

        //CRIANDO E INICIANDO A THREAD 1
        ThreadSoma ts1 = new ThreadSoma("Thread 1",sInputs1);
        Thread t1 = new Thread(ts1,ts1.nome);
        t1.start();

        //CRIANDO E INICIALIZANDO A THREAD 2
        ThreadSoma ts2 = new ThreadSoma("Thread 2",sInputs2);
        Thread t2 = new Thread(ts2,ts2.nome);
        t2.start();
    }
}