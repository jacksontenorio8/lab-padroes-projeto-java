package br.com.jacksontenorio8;

/*
 * Sigleton "apressado",
 * @ falvojr
 * */
public class SigletonEager {

    private static SingletonEager instancia = new SigletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){

        return instancia;

    }
}
