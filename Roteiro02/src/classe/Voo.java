package classe;

import java.util.List;
import classe.Passageiro;
import java.util.ArrayList;
import java.util.Scanner;

public class Voo {

    private Scanner ler = new Scanner(System.in);
    private double idVoo;
    private String destino;
    private double capacidadeMax;
    private List<Passageiro> listaDePassageiros;
    private List<String> listaEscalas;
    private String estadoVoo;

    public Voo() {
        idVoo = 0;
        destino = "";
        capacidadeMax = 0;
        listaDePassageiros = new ArrayList<>();
        listaEscalas = new ArrayList<>();
        estadoVoo = "";
    }

    public Voo(double idVoo, String destino, double capacidadeMax ) {
        this.idVoo = idVoo;
        this.destino = destino;
        this.capacidadeMax = capacidadeMax;
        listaDePassageiros = new ArrayList<>();
        listaEscalas = new ArrayList<>();
    }

    //setter
    public void setIdVoo(double idVoo) {
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
    public double getIdVoo() {
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
        return "Voo{ idVoo=" + idVoo + ", destino=" + destino + ", capacidadeMax=" + capacidadeMax + ", \nlistaDePassageiros=" + listaDePassageiros + ", \nlistaEscalas=" + listaEscalas + ", \nestadoVoo=" + estadoVoo + '}';
    }
    
    public void ImprimirPassageiros(){
        for (Passageiro passageiro : listaDePassageiros) {
            passageiro.toString();
        }
    }
}
