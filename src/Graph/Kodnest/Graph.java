package Graph.Kodnest;

import java.util.*;

public class Graph {
    Map<String, List<String> > adjList;
    Graph(){
        adjList = new HashMap<>();
    }

    public void addNode(String node){
        adjList.putIfAbsent(node,new ArrayList<>());
    }
    public void addEdge(String from,String to){
        adjList.get(from).add(to);
        adjList.get(to).add(from);
    }
    public void printGraph(){
        for (String node : adjList.keySet()){
            System.out.print(node +" node ->");
            System.out.println(adjList.get(node));
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("B","D");
       graph.printGraph();
    }
}
