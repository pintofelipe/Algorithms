#include <iostream>
#include <cstdlib>   // Para rand() y srand()
#include <ctime>     // Para time()
#include <chrono>    // Para medir el tiempo

using namespace std;

int main()
{
    int m;
    cin >> m;

    int matriz[m][m];

    srand(time(NULL));

    auto start = chrono::high_resolution_clock::now();


    for(int i=0; i<m; i++){
        for(int j=0; j<m; j++){
            matriz[i][j] = rand() % 20;
        }
    }

    for(int i=0; i<m; i++){
        for(int j=0; j<m; j++){
            cout << matriz[i][j] << " ";
        }
        cout << endl;
    }


    auto end = chrono::high_resolution_clock::now();
    auto duration = chrono::duration_cast<chrono::milliseconds>(end - start).count();


    cout << "Tiempo de ejecución: " << duration << " ms" << endl;

    return 0;
}
