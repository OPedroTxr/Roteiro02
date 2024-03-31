package roteiro02;

import classe.Aeroporto;
import classe.Passageiro;
//import classe.SistemaDeFidelidade;
import classe.Voo;
import java.util.ArrayList;
import java.util.List;

public class main {


    public static void main(String[] args) {
        //Criação de lista de voo
        List<Voo> listaDeVoo = new ArrayList<>();
        Voo voo1 = new Voo("0001", "Bahamas", 615);
        Voo voo2 = new Voo("0002", "Orlando", 350);
        listaDeVoo.add(voo1);
        listaDeVoo.add(voo2);
        
        //Adicionando passageiros e encaixando eles no voo
        Passageiro pass1 = new Passageiro("Jucemar Morais Inácio", "415.730.209-58");
        Passageiro pass2 = new Passageiro("Ana Cristina Bastida Thomaz", "428.573.580-67");
        Passageiro pass3 = new Passageiro("Carlos Henrique Tavares Pinto", "179.414.063-81");
        Passageiro pass4 = new Passageiro("Deyse Falcão Correia", "610.991.838-55");
        Passageiro pass5 = new Passageiro("Vanda Bragança Leandro", "338.518.304-90");
        Passageiro pass6 = new Passageiro("Ezeni Silveira Figueiro", "231.418.451-31");
        
        voo1.addPassageiro(pass1);
        voo1.addPassageiro(pass2);
        voo1.addPassageiro(pass3);
        voo1.addPassageiro(pass4);
        voo1.addPassageiro(pass5);
        
        voo2.addPassageiro(pass6);
        
        //adicionando pontos aos passageiros
        pass1.setPontos(500);   //Bahamas
        pass2.setPontos(500);   //Bahamas
        pass3.setPontos(500);   //Bahamas
        pass4.setPontos(500);   //Bahamas
        pass5.setPontos(500);   //Bahamas
        
        pass6.setPontos(900);   //Orlando 
        
        //Adicionando Escalas ao voo
        voo1.addEscalas("Bogota");
        voo1.addEscalas("Miami");
        
        voo2.addEscalas("São Paulo");
        voo2.addEscalas("Miami");
        
        //Criando aeroporto e adicionando voos
        Aeroporto aeroporto1 = new Aeroporto("Aeroporto Regional da Zona da Mata / Presidente Itamar Franco", "Rod. MG-353 S/N, km. 38, Goianá, MG", listaDeVoo);
        aeroporto1.addVoo(voo1);
        aeroporto1.addVoo(voo2);
        
        //impressões:
        System.out.println("\n- - - - - Informacoes do voo 1 - - - - -");
        System.out.println(voo1.toString());
        
        System.out.print("O voo ha prejuizo: ");
        aeroporto1.verificPrejuizo(0);  //Verifica se há prejuízo no 1º voo do aeroporto.
        
        System.out.println("\n- - - - - Informacoes do voo 2 - - - - -");
        System.out.println(voo2.toString());
        
        System.out.print("O voo ha prejuizo: ");
        aeroporto1.verificPrejuizo(1);  //Verifica se há prejuízo no 2º voo do aeroporto.
        
        
        //removendo pontos de um passageiro
        System.out.print("\nAplicando desconto de pontos em passageiro:");
        pass6.resgatarPontos(390);
        pass6.imprimir();
        
    }
}
