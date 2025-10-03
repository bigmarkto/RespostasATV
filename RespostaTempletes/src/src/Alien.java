class Alien extends Entidade {
    @Override
    protected void atirar() {
        System.out.println("Alien atirando");
    }

    @Override
    protected void mover() {
        System.out.println("Alien movendo");
    }
}
class Robo extends Entidade {
    @Override
    protected void atirar() {
        System.out.println("Robo atirando");
    }

    @Override
    protected void mover() {
        System.out.println("Robo movendo");
    }
}