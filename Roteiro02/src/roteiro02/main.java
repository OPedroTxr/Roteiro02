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
        Passageiro pass1 = new Passageiro("José Rui", "314.256.132-53");
        Passageiro pass2 = new Passageiro("Thomas Turbando", "322.145.235-45");
        Passageiro pass3 = new Passageiro("Kleyton Nascimento", "612.412.642-57");
        Passageiro pass4 = new Passageiro("Isadora Pinto", "690.320.436-76");
        Passageiro pass5 = new Passageiro("Paula Tejando", "542.421.645-24");
        Passageiro pass6 = new Passageiro("Sujiro Kimi Mame", "155.235.215-56");
        
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
        
        pass6.setPontos(600);   //Orlando 
        
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
        
    }
}
