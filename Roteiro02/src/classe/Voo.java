package classe;

import java.util.List;
import classe.Passageiro;
import java.util.ArrayList;
import java.util.Scanner;

public class Voo {

    private Scanner ler = new Scanner(System.in);
    private String idVoo;
    private String destino;
    private double capacidadeMax;
    private List<Passageiro> listaDePassageiros;
    private List<String> listaEscalas;
    private String estadoVoo;

    public Voo() {
        this.idVoo = "";
        this.destino = "";
        this.capacidadeMax = 0;
        this.listaDePassageiros = new ArrayList<>();
        this.listaEscalas = new ArrayList<>();
        this.estadoVoo = "Aguardando passageiros";
    }

    public Voo(String idVoo, String destino, double capacidadeMax ) {
        this.idVoo = idVoo;
        this.destino = destino;
        this.capacidadeMax = capacidadeMax;
        this.listaDePassageiros = new ArrayList<>();
        this.listaEscalas = new ArrayList<>();
        this.estadoVoo = "Aguardando passageiros";
    }

    //setter
    public void setIdVoo(String idVoo) {
        this.idVoo = idVoo;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setCapacidadeMax(double capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public void setListaDePassageiros(List<Passageiro> listaDePassageiros) {
        this.listaDePassageiros = listaDePassageiros;
    }

    public void setListaEscalas(List<String> listaEscalas) {
        this.listaEscalas = listaEscalas;
    }

    public void setEstadoVoo(String estadoVoo) {
        this.estadoVoo = estadoVoo;
    }

    //getter
    public String getIdVoo() {
        return idVoo;
    }

    public String getDestino() {
        return destino;
    }

    public double getCapacidadeMax() {
        return capacidadeMax;
    }

    public List<Passageiro> getListaDePassageiros() {
        return listaDePassageiros;
    }

    public List<String> getListaEscalas() {
        return listaEscalas;
    }

    //funcoes
    public String getEstadoVoo() {
        return estadoVoo;
    }

    public void addPassageiro(String nome, String cpf) {
        Passageiro passageiro = new Passageiro(nome, cpf);
        this.listaDePassageiros.add(passageiro);
    }
    
    public void addPassageiro(Passageiro passageiro) {
        this.listaDePassageiros.add(passageiro);
    }

    public void removePassageiro(String nome) {
        listaDePassageiros.remove(procurarPassageiroNome(nome));
    }

    public Passageiro procurarPassageiroNome(String busca) {
        for (Passageiro passageiro : listaDePassageiros) {
            if (passageiro.getNome().equals(busca)) {
                return passageiro;
            }
        }
        return null;
    }

    public void addEscalas(String escala){
        listaEscalas.add(escala);
    }
    
    public void removerEscalas(String escala){
        listaEscalas.remove(escala);
    }
    
    public void alterarEstadoDoVoo(String novoEstado) {
        this.estadoVoo = novoEstado;
    }

    public boolean estaAbaixoDaCapacidadeMin() {
        return this.listaDePassageiros.size() < 5;
    }

    @Override
    public String toString() {
        return "Voo{ idVoo: " + idVoo + ", destino: " + destino + ", capacidadeMax: " + capacidadeMax 
                + ", \nlistaDePassageiros: " + listaDePassageiros + ", \nlistaEscalas: " + listaEscalas 
                + ", \nestadoVoo: " + estadoVoo + '}';
    }
    
    public void ImprimirPassageiros(){
        for (Passageiro passageiro : listaDePassageiros) {
            passageiro.toString();
        }
    }
}
