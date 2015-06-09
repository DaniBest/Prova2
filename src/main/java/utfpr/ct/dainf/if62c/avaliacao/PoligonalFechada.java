/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author DANIEL
 */
public class PoligonalFechada extends Poligonal {

    public PoligonalFechada(int n) {
        super(n);
    }

    @Override
    public double getComprimento() {
        double distancia = 0;
        for (int i = 0; i < (getN() - 1); i++) {
            distancia += get(i).dist(get(i + 1));
        }
        distancia += get(getN()-1).dist(get(0));
        return distancia;
    }

}
