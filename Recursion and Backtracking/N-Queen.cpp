#include <iostream>
using namespace std;
bool sol[1001][1001] {{false}};
bool isSafe(int N, int c, int r) {
    for (int i = 0; i <= c; i++) {
        if (sol[r][i] == true)
            return false;
    }
    for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) 
        if (sol[i][j]) return false;
    
    for (int i = r, j = c; i < N && j >= 0; i++, j--)
        if (sol[i][j]) return false; 

    return true;
}
bool hasSol(int N, int c) {
    if (c == N) return true;
    for (int i = 0; i < N; i++) {
        if (isSafe(N, c, i)) {
            sol[i][c] = true;
            if (hasSol(N, c + 1))
                return true;
            sol[i][c] = false;
        }
    }
    return false;
}
int main() {
    int N = 6;
    bool res = hasSol(N, 0);
    cout << boolalpha << res << '\n' << noboolalpha;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++)
            cout << sol[i][j] << " ";
        cout << '\n';
    }
    return 0;
}