public class Aluno extends Observer {
    private String nome;
    public Aluno(String nome){
        this.nome = nome;
    }
    @Override
    public void update(String tarefa){
        System.out.println(nome +" recebeu a
                tarefa:" +tarefa);
    }
}