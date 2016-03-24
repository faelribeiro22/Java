/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica20160324;

/**
 *
 * @author faelr
 */
public class Principal {
    public static void main(String args[]){
        Ponto a = new Ponto();
        Ponto b = new Ponto();
        Ponto c = new Ponto();
        Ponto d = new Ponto();
        
        a.setX(2);
        a.setY(2);
        b.setX(2);
        b.setY(4);
        c.setX(4);
        c.setY(4);
        d.setX(4);
        d.setY(2);
        
        Quadrilatero q = new Quadrilatero();
        q.cadastrarVertice(a, b, c, d);
        
        if(q.ehQuadrado()){
            System.out.println("é um quadrado");
        }
    }
}
