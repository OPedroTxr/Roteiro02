package classe;

public class SistemaDeFidelidade {
    private int pontos;
    
    public SistemaDeFidelidade(){
        this.pontos = 0;
    }
    
    public void addPontos(int pontos){
        if(pontos > 0){
            this.pontos += pontos;
        }
    }
    
    public int getSaldoPontos(){
        return this.pontos;
    }
    
    public boolean resgatarPontos(int valorResgatado){
        if(valorResgatado > this.pontos || valorResgatado <= 0){
            return false;
        }else{
            this.pontos -= valorResgatado;
            return true;
        }
    }
}
