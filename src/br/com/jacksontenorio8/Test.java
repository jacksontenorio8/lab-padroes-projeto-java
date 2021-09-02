package br.com.jacksontenorio8;

public class Test {
    public static void main(String[] args) {
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
    }
}
