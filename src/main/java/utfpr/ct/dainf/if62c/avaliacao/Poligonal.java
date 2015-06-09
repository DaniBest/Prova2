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
public class Poligonal {

    private Ponto2D[] vertices;
    private int nvertices;

    public Poligonal(int n) {

        if (n < 2) {
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        } else {
            vertices = new Ponto2D[n];
            nvertices = n;
        }
    }

    /*protected Ponto2D[] getVertices() {
        return vertices;
    }*/

    public int getN() {
        return nvertices;
    }

    public Ponto2D get(int i) {
        if (i < 0 || i > (nvertices - 1)) {
            return null;
        } else {
            return vertices[i];
        }
    }

    public void set(int i, Ponto2D p) {
        if (i >= 0 && i <= (nvertices - 1)) {
            boolean teste = false;
            int indice = 0;
            for (int k = 0; k < (nvertices); k++) {
                if (vertices[k] != null) {
                    teste = true;
                    indice = k;
                }
            }
            if (teste) {
                if (vertices[indice].getClass() != p.getClass()) {
                    throw new RuntimeException("Vértices devem estar no mesmo plano");
                } else {
                    vertices[i] = p;
                }

            } else {
                vertices[i] = p;
            }
        }
    }

    public double getComprimento() {
        double distancia = 0;
        for (int i = 0; i < (nvertices - 1); i++) {
            distancia += vertices[i].dist(vertices[i + 1]);
        }
        return distancia;
    }

}
