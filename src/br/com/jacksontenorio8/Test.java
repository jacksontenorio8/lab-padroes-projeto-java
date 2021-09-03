package br.com.jacksontenorio8;

import br.com.jacksontenorio8.singleton.SigletonEager;
import br.com.jacksontenorio8.singleton.SigletonLazy;
import br.com.jacksontenorio8.singleton.SigletonLazyHoder;
import br.com.jacksontenorio8.strategy.*;

public class Test {
    public static void main(String[] args) {
        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SigletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SigletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHoder lazyHoder = SingletonLazyHoder.getInstancia();
        System.out.println(lazyHoder);
        lazyHoder = SigletonLazyHoder.getInstancia();
        System.out.println(lazyHoder);


        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
    }
}
