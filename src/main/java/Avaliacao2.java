
import utfpr.ct.dainf.if62c.avaliacao.PoligonalFechada;
import utfpr.ct.dainf.if62c.avaliacao.Ponto;
import utfpr.ct.dainf.if62c.avaliacao.PontoXY;
import utfpr.ct.dainf.if62c.avaliacao.PontoXZ;
import utfpr.ct.dainf.if62c.avaliacao.PontoYZ;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author Daniel Anderson de Freitas
 */
public class Avaliacao2 {

    public static void main(String[] args) {
           /*
        Ponto p = new Ponto();
        Ponto q = new Ponto(3, 0, 5);
        PontoXY a = new PontoXY();
        PontoYZ b = new PontoYZ(7, 4);
        System.out.println(q.dist(p));
        System.out.println(p.dist(q));
        System.out.println(Math.sqrt(5));
        System.out.println(p);
        System.out.println(q);
        
        System.out.println(a);
        System.out.println(b);
        */
        
        PoligonalFechada pxz = new PoligonalFechada(3);
        PontoXZ p1 = new PontoXZ(-3,2);
        PontoXZ p2 = new PontoXZ(-3,6);
        PontoXZ p3 = new PontoXZ(0,2);
        pxz.set(0, p1);
        pxz.set(1, p2);
        pxz.set(2, p3);
        double comprimento = pxz.getComprimento();
        System.out.println(String.format("Comprimento da poligonal = %f", comprimento));
        
    }
    
}
