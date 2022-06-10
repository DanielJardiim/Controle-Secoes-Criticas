package trabalhopratico;

public class ProcessoUsuarios implements Runnable {
    //FILA DOS USUÁRIOS
    FilaUsuarios filaUsuarios;

    //RECEBENDO A FILA QUE A THREAD VAI DISPUTAR RECURSO
    public ProcessoUsuarios(FilaUsuarios fU) {
        filaUsuarios = fU;
    }

    @Override
    public void run() {
        //filaUsuarios.usuarioSemSemaforo();;
        filaUsuarios.usuarioComSemaforo();;
    }
}
