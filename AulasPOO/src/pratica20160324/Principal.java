/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica20160324;
import java.util.Scanner;
/**
 *
 * @author faelr
 */
public class Principal {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Ponto a = new Ponto();
        Ponto b = new Ponto();
        Ponto c = new Ponto();
        Ponto d = new Ponto();
        
        System.out.println("Digite a coordenada X do ponto A");
        a.setX(s.nextFloat());
        System.out.println("Digite a coordenada Y do ponto A");
        s.nextLine();
        a.setY(s.nextFloat());
        System.out.println("Digite a coordenada X do ponto B");
        b.setX(s.nextFloat());
        s.nextLine();
        System.out.println("Digite a coordenada Y do ponto B");
        b.setY(s.nextFloat());
        s.nextLine();
        System.out.println("Digite a coordenada X do ponto C");
        c.setX(s.nextFloat());
        s.nextLine();
        System.out.println("Digite a coordenada Y do ponto C");
        c.setY(s.nextFloat());
        s.nextLine();
        System.out.println("Digite a coordenada X do ponto D");
        d.setX(s.nextFloat());
        s.nextLine();
        System.out.println("Digite a coordenada Y do ponto D");
        d.setY(s.nextFloat());
        
        Quadrilatero q = new Quadrilatero();
        q.cadastrarVertice(a, b, c, d);
        
        if(q.ehQuadrado()){
            System.out.println("é um quadrado");
        }else{
            System.out.println("Não é um quadrado");
        }
    }
}
