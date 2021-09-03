package br.com.jacksontenorio8.singleton;

/*
* Sigleton "pregiçoso",
* @ falvojr
* */
public class SigletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia(){
        if (istancia == null){
            instancia = new SigletonLazy();
        }
        return instancia;

    }
}
