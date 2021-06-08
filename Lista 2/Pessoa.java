import java.util.Calendar;

public class Pessoa
{
    private String nome;
    private String sobrenome;
    private int anoDeNascimento;
    
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
        return nome + " " + sobrenome;
    }
    
    public int getIdade() {
        return getAnoAtual() - anoDeNascimento;
    }
    
    public int getIdadeEmMeses() {
        return getIdade() * 12;
    }
    
    
    private int getAnoAtual() {
        Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.YEAR);
    }
}