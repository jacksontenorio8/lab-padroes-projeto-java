package br.com.jacksontenorio8;

import br.com.jacksontenorio8.facade.Facade;
import br.com.jacksontenorio8.strategy.*;

public class Test {
    public static void main(String[] args) {
        
        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        //Facede
        Facade facade = new Facade();
        facade.migrarCliente("Venilton","14801788");
    }
}
