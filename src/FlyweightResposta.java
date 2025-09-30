public class FlyweightResposta {

    Carta c1 = CartaFactory.getCarta("Ataque", 1,"Causa 10 de dano");
    c1.exibir(1);
    Carta c2 = CartaFactory.getCarta("Bola de Fogo", 2,"Causa 10 dedano");
    c2.exibir(2);
    Carta c3 = CartaFactory.getCarta("Cura", 1,"Recupera 5 de vida");
    c3.exibir(3);

}
