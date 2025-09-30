public class BridgeResposta {
    interface Canal {
        void enviar(String msg);
    }
    class Email implements Canal {
        public void enviar(String msg) {
            System.out.println("Enviando por Email: " + msg);
        }
    }
    class SMS implements Canal {
        public void enviar(String msg) {
            System.out.println("Enviando por SMS: " + msg);
        }
    }
    abstract class Mensagem {
        protected Canal canal;
        public Mensagem(Canal canal) {
            this.canal = canal;
        }
        abstract void enviar(String msg);
    }
    class MensagemUrgente extends Mensagem {
        public MensagemUrgente(Canal canal) {
            super(canal);
        }
        public void enviar(String msg) {
            canal.enviar("[URGENTE] " + msg);
        }
    }
    public class Main {
        public static void main(String[] args) {
            Mensagem msg1 = new MensagemUrgente(new Email());
            Mensagem msg2 = new MensagemUrgente(new SMS());

            msg1.enviar("Reunião às 10h");
            msg2.enviar("Reunião às 10h");
        }
    }
}
