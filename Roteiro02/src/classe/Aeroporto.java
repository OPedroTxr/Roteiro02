/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author 15102938681
 */
public class Aeroporto {
//    nome, localização, lista de voos.
    private String nome;
    private String localizacao;
    private List<Voo> listVoos ;

    public Aeroporto(String nome, String localizacao, List<Voo> listVoos) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.listVoos = new ArrayList<>();
    }
    
    public Aeroporto() {
        this.nome = "";
        this.localizacao = "";
        this.listVoos = new ArrayList<>();
    }
    
    public void imprimir(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Aeroporto{" + "nome=" + nome + ", localizacao=" + localizacao + ", listVoos=" + listVoos + '}';
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void addVoo(Voo voos){
       this.listVoos.add(voos);
    }
    
    public void removeVoo(String destino){
        this.listVoos.remove(findVoo(destino));
        
    }
    
    public Voo findVoo(String destino){
         for (Voo voo: listVoos){
            if (voo.getDestino().equals(destino)) {
                return voo;
            }
        }
        return null;
    }
    
    public void verificPrejuizo(int n){
        if(listVoos.get(n).estaAbaixoDaCapacidadeMin()== true){
            System.out.println("Ha prejuizo.");
        }
    }
    
   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.localizacao);
        hash = 29 * hash + Objects.hashCode(this.listVoos);
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
        final Aeroporto other = (Aeroporto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.localizacao, other.localizacao)) {
            return false;
        }
        return Objects.equals(this.listVoos, other.listVoos);
    }
   
   
   
    
    
    
    
    
}
