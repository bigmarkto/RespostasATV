public class FacadeResposta {

    public class Principal {
        public static void main(String[] args) {
            JogoFacade jogo = new JogoFacade();
            jogo.iniciarJogo();
        }
    }
    public class JogoFacade {
        private Mapa mapa;
        private Inventario inventario;
        private Combate combate;
        public JogoFacade() {
            mapa = new Mapa();
            inventario = new Inventario();
            combate = new Combate();
        }
        public void iniciarJogo() {
            mapa.carregarMapa();
            inventario.adicionarItensIniciais();
            combate.ativar();
            System.out.println("Jogo iniciado! Boa aventura ");
        }
    }

}
