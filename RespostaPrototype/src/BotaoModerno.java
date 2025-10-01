public class BotaoModerno implements ElementoDesign {
    private String corFundo, corTexto, fonte;

    public BotaoModerno() {

        this.corFundo = "#3498db";
        this.corTexto = "#ffffff";
        this.fonte = "Arial, 14px, bold";

    }
    public ElementoDesign clone() {
        BotaoModerno clone = new BotaoModerno();

        clone.corFundo = this.corFundo;
        clone.corTexto = this.corTexto;
        return clone;
    }

    @Override
    public void renderizar() {

    }
}