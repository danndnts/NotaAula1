public class Aluno extends Pessoa{

    private double nota01;
    private double nota02;
    private double nota03;

    private String situacao;
    private double media;

    public Aluno() {

    }

    public Aluno(String nome, double nota01, double nota02, double nota03) {
        super(nome);
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    public double getNota01() {
        return nota01;
    }

    public void setNota01(double nota01) {
        this.nota01 = nota01;
    }

    public double getNota02() {
        return nota02;
    }

    public void setNota02(double nota02) {
        this.nota02 = nota02;
    }

    public double getNota03() {
        return nota03;
    }

    public void setNota03(double nota03) {
        this.nota03 = nota03;
    }



    public void calcularMedia(){
        media = (nota01 + nota02 + nota03)/3;
    }
    public void verificarAprovacao(){
        if(media >= 7){
            situacao = "APROVADO";
        }else if(media >= 5){
            situacao = "RECUPARAÇÃO";
        }else{
            situacao = "REPROVADO";
        }

    }
    public void exibirDetalhesAluno(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nota 1 " + getNota01());
        System.out.println("Nota 2: " + getNota02());
        System.out.println("Nota 3: " + getNota03());
        System.out.println("Média: " + getMedia());
        System.out.println("Situacao: " + getSituacao());

    }


}