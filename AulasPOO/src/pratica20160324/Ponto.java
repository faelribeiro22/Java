package pratica20160324;

public class Ponto {
    
    private float x;
    private float y;
    
    public void setX(float x1){
        if(!this.ehNegativo(x1)){
            x = x1;
        }
    }
    
    public void setY(float y1){
        if(!this.ehNegativo(y1))
            y = y1;
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
    public boolean ehNegativo(float n){
        return n < 0;
    }
    /*
    public boolean inicializa(float x1, float y1){
        
        
        if(x1 > 0 && y1 > 0){
            x = x1;
            y = y1;
            return true;
        }
        return false;
    }
    */
    public float distancia(Ponto ponto){
        
        float res1 = (float)Math.pow(ponto.getX() - getX(),2);
        float res2 = (float)Math.pow(ponto.getY() - getY(), 2);
        //return (float)Math.sqrt(res1+res2);
        return (float)Math.sqrt(Math.pow((ponto.getX() - getX()),2) + Math.pow(ponto.getY() - getY(),2));
        //return (float)Math.sqrt(Math.pow((ponto1.getX() - ponto2.getX()),2) + Math.pow(ponto1.getY() - ponto2.getY(),2));
    } 
    
}
