/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cyril
 */
public class TestGraph {
    public static void main(String[] args) {
        Graph ug = new UndirectedGraph();
        ug.addVertex("A");
        ug.addVertex("B");
        ug.addVertex("C");
        ug.addEdge("A", "B");
        ug.addEdge("C", "B");
    }
}
