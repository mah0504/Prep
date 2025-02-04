#include <vector>
#include <iostream>
#include <algorithm>

class KruskalImplem {
    int fathers[100];
    int n, m;
    int nbr_edges;
    int mst_weight;

public:

    void initialize(int nodes) {
        n = nodes;
        for (int i = 0; i < 100; i++) {
            fathers[i] = i; 
        }
        nbr_edges = 0;
        mst_weight = 0;
    }

    int find(int x) {
        if (fathers[x] != x) {
            fathers[x] = find(fathers[x]);  
        }
        return fathers[x];
    }

    void unite(int x, int y) {
        int fx = find(x);
        int fy = find(y);
        fathers[fx] = fy; 
    }

    void run() {
        
        std::cin >> n >> m;  // Nombre de nœuds et arêtes

        std::vector<std::pair<int, std::pair<int, int> > > edges;
        initialize(n);
        for (int i = 0; i < m; i++) {
            int a, b, w;
            std::cin >> a >> b >> w;
            edges.push_back(std::make_pair(w, std::make_pair(a, b)));
        }

        std::sort(edges.begin(), edges.end());  // Tri des arêtes par $$

        int mst_n = 0;

        while (nbr_edges < n - 1 || mst_n < m) {
            int a = edges[mst_n].second.first;
            int b = edges[mst_n].second.second;
            int w = edges[mst_n].first;

            if (find(a) != find(b)) {
                unite(a, b);
                mst_weight += w;
                nbr_edges++;
                std::cout << "Arête ajoutée au MST: " << a << " - " << b << " avec poids " << w << std::endl;

            }
            mst_n++;
        }

        std::cout << "Poids total du MST: " << mst_weight << std::endl;
    }
};

int main() {
    KruskalImplem kruskal;
    kruskal.run();
    return 0;
}
