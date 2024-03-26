package classe;

import java.util.Objects;

public class Passageiro {
// nome, CPF (ou outro identificador único). 

    private String nome;
    private String cpf;
    private SistemaDeFidelidade pontos;

    //construtores
    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        pontos = new SistemaDeFidelidade();
    }

    public Passageiro() {
        this.nome = "";
        this.cpf = "";
        pontos = new SistemaDeFidelidade();
    }

    public Passageiro(Passageiro outro) {
        this.nome = outro.getNome();
        this.cpf = outro.getCpf();
        this.pontos = new SistemaDeFidelidade();
        this.pontos.addPontos(outro.getPontos());
    }

    //metodo de copy
    public void copy(Passageiro outro) {
        this.nome = outro.getNome();
        this.cpf = outro.getCpf();
    }
    
    //metodo de impressão
    public void imprimir() {
        System.out.println(this.toString());
    }
    
    public void resgatarPontos(int pontos){
        this.pontos.resgatarPontos(pontos);
    }

    @Override
    public String toString() {
        return "\nPassageiro {" + "nome: " + nome + ", cpf: " + cpf + ", pontos acumulados: " + pontos.getSaldoPontos() + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.cpf);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Passageiro other = (Passageiro) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.cpf, other.cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPontos() {
        return pontos.getSaldoPontos();
    }

    public void setPontos(int pontos) {
        this.pontos.addPontos(pontos);
    }
}
