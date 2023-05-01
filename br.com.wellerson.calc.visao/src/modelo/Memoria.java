package modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

    private  enum tipoComando{
        ZERAR, NUMERO, DIV, MULTI, SUB, SOMA, IGUAL, VIRGULA
    }
    private static final Memoria instancia = new Memoria();

    private final List<MemoriaObservador> observadors = new ArrayList<>();
    private String textoAtual = "";

    private Memoria() {

    }

    public static Memoria getInstance(){
        return instancia;
    }

    public void adiccionarObservador(MemoriaObservador observador){
        observadors.add(observador);
    }
    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public void processarComando(String valor){
        if ("AC".equals(valor)) {
            textoAtual ="";
        } else {

        textoAtual += valor;
        }



        observadors.forEach(o -> o.valorAlterado(getTextoAtual()));

    }
}
