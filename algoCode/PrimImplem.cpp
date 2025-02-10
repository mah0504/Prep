#include <iostream>
#include <vector>
#include <queue>
#include <climits>

using namespace std;

void printMST(vector<int> &parent, vector<vector<int> > &graph) {
    cout << "Edge \tWeight\n";
    for (int i = 1; i < parent.size(); i++)
        cout << parent[i] << " - " << i << " \t" << graph[parent[i]][i] << " \n";
}


void primMST(vector<vector<int> > &graph) {
    int V = graph.size();  

    vector<int> parent(V);
    vector<int> key(V, INT_MAX);
    vector<bool> inMST(V, false);

    // Priority queue min-heap (poids, sommet)
    priority_queue<pair<int, int>, vector<pair<int, int> >, greater<pair<int, int> > > pq;

    // Démarrer avec le sommet 0
    key[0] = 0;
    pq.push((make_pair(0, 0)));
    parent[0] = -1;

    while (!pq.empty()) {
        int u = pq.top().second;
        pq.pop();

        inMST[u] = true;

        for (int v = 0; v < V; v++) {
            if (graph[u][v] && !inMST[v] && graph[u][v] < key[v]) {
                parent[v] = u;
                key[v] = graph[u][v];
                pq.push(make_pair(key[v], v));
            }
        }
    }

    printMST(parent, graph);
}


int main() {
   vector<vector<int> > graph;

    vector<int> row1; row1.push_back(0); row1.push_back(2); row1.push_back(0); row1.push_back(6); row1.push_back(0);
    vector<int> row2; row2.push_back(2); row2.push_back(0); row2.push_back(3); row2.push_back(8); row2.push_back(5);
    vector<int> row3; row3.push_back(0); row3.push_back(3); row3.push_back(0); row3.push_back(0); row3.push_back(7);
    vector<int> row4; row4.push_back(6); row4.push_back(8); row4.push_back(0); row4.push_back(0); row4.push_back(9);
    vector<int> row5; row5.push_back(0); row5.push_back(5); row5.push_back(7); row5.push_back(9); row5.push_back(0);

    graph.push_back(row1);
    graph.push_back(row2);
    graph.push_back(row3);
    graph.push_back(row4);
    graph.push_back(row5);
    primMST(graph);
    return 0;
}
