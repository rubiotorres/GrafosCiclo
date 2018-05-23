package controller;

import model.JCiclo;
import model.JGrafo;

/**
 *
 * @author gabrieldutra, rubiotorres, MarceloFCandido
 */
public class Principal {

    public static void main(String[] args) throws Exception {

        JGrafo grafo = new JGrafo(10, 14);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(2, 3, 1);
        grafo.insereAresta(4, 6, 1);
        grafo.insereAresta(6, 7, 1);
        grafo.insereAresta(6, 8, 1);
        grafo.insereAresta(7, 8, 1);
        grafo.insereAresta(9, 6, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 5, 1);
        grafo.insereAresta(0, 3, 1);
        grafo.insereAresta(5, 6, 1);
        grafo.insereAresta(5, 4, 1);

        grafo.imprime();
        JCiclo ciclo = new JCiclo(grafo);
        ciclo.buscaEmProfundidade();
        if (grafo.ciclo) {
            System.out.println("\nCiclico\n");
        } else {
            System.out.println("\nAciclico\n");
        }

    }
}
