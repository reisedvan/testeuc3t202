package testeemaula.cadastrodeclientes.entity;

import java.sql.Date;

public class Cliente {

    private String cpf;
    private String nome;
    private String sobrenome;
    private Date data_nascimento;

    public Cliente(String cpf, String nome, String sobrenome, Date data_nascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data_nascimento = data_nascimento;
    }    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + ", sobrenome=" + sobrenome + ", data_nascimento=" + data_nascimento + '}';
    }

}
