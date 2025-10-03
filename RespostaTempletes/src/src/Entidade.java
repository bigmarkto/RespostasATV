abstract class Entidade {
    public final void Passo() {

        colisao();

        atirar();

        mover();

    }

    private void colisao() {
        System.out.println("Colisao");
    }
    protected abstract void atirar();

    protected abstract void mover();
}