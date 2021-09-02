package br.com.jacksontenorio8;

/*
 * Sigleton "LazyHoder",
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 * @ falvojr
 * */
public class SigletonLazyHoder {

    private static class InstanceHoder{
        public static SingletonLazyHoder instancia = new SigletonLazyHoder();
    }


    private SingletonLazyHoder() {
        super();
    }

    public static SingletonLazyHoder getInstancia(){

        return InstanceHoder.instancia;

    }
}
