//Modelo computacionalmente o problema de obter o nome completo, a idade, a
//idade em meses a partir do nome, sobrenome e ano de nascimento de uma
//pessoa. O valor inicial do nome e sobrenome deve ser “<Não informado>”, para
//ano de nascimento deve ser 0. Somente deve ser possível instanciar um objeto
//informando os valores dos atributos do na instanciação. Também não deve-se
//aceitar dados inválidos.
//Dados válidos:
//1. nome e sobrenome:
//1. não pode ser vazio e deve conter mais de 3 caracteres.
//2. Deve automaticamente remover os espaços em branco antes e depois
//do parâmetro
//3. Deve automaticamente transformar a string para capitalize, por
//exemplo, se o parâmetro for diego deve ser convertido para Diego.
//2. Ano de nascimento:
//1. Deve ser menor ou igual ao ano atual

import java.util.Calendar;

public class Pessoa
{
    private String nome;
    private String sobrenome;
    private int anoDeNascimento;
    
    public Pessoa() {
        nome = "<desconhecido>";
    }
    
    public Pessoa(String nome, String sobrenome, int anoDeNascimento) {
        setNome(nome);
        setSobrenome(sobrenome);
        setAnoDeNascimento(anoDeNascimento); 
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento; 
    }
    
    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }
    
    public String getNomeCompleto() {
        return nome + " "+ sobrenome;
    }
    
    public int getIdade() {
        return getAnoAtual() - anoDeNascimento;
    }
    
    public int getIdadeEmMeses() {
        return getIdade() * 12;
    }
    
   public int getAnoAtual() {
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.YEAR);
    }
}