package Graph.Kodnest.Kodnest;

import java.util.*;

public class SocialCirclesGraph {

    Map<String, List<String>> adjList;

    SocialCirclesGraph(){
        adjList = new LinkedHashMap<>();
    }

    public void addStudent(String node){
        adjList.putIfAbsent(node,new ArrayList<>());
    }
    public void makeConnections(String from,String to){
        adjList.get(from).add(to);
        adjList.get(to).add(from);
    }
    public void print() {
        for (String node : adjList.keySet()) {
            System.out.print(node + ":");
            List<String> neighbors = adjList.get(node);

            for (int i = 0; i < neighbors.size(); i++) {
                System.out.print(neighbors.get(i));
                if (i < neighbors.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        SocialCirclesGraph graph = new SocialCirclesGraph();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String [] names = sc.nextLine().split("\\s+");
        for (int i = 0; i < names.length; i++) {
            graph.addStudent(names[i]);
        }
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String [] connection = sc.nextLine().split("\\s+");
            graph.makeConnections(connection[0],connection[1]);
        }
        graph.print();
        
    }
}
