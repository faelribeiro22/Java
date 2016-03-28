package pratica20160324;

/**
 *
 * @author faelr
 */
public class Quadrilatero {
    
    private Ponto a = new Ponto();
    private Ponto b = new Ponto();
    private Ponto c = new Ponto();
    private Ponto d = new Ponto();
    
    public void cadastrarVertice(Ponto a1, Ponto b1, Ponto c1, Ponto d1){
        
       if(this.verificaVertice(a1, b1) && this.verificaVertice(b1, c1) && this.verificaVertice(c1, d1) && this.verificaVertice(d1, a1)){
            a = a1;
            b = b1;
            c = c1;
            d = d1;
        }
    }
    
    public boolean ehQuadrado(){
        return a.distancia(b) == b.distancia(c) && c.distancia(d) == d.distancia(a);
    }
    
    public boolean verificaVertice(Ponto a, Ponto b){
        return ((a.getX() == b.getX() && a.getY() != a.getY()) || (a.getX() != b.getX() && a.getY() == b.getY()));
    }
    
    
}
