#include <bits/stdc++.h>
using namespace std;
#define SIZE 801

int search( int n,int m, int x, int[SIZE][SIZE]);

int main() {
  int t;
  cin>>t;
  while (t--)
  {
    int n,m,x,i,j;
    cin>>n>>m;
    
    int mat[SIZE][SIZE];
    
    for(i=0;i<n;i++){
      for(j=0;j<m;j++){
          mat[i][j] = 0;
        cin>>mat[i][j];
      }
    }
    
    cin>>x;
    cout << search(n,m,x, mat) << endl;
  
  }
  return 0;
}

int search( int n,int m, int x, int mat[SIZE][SIZE]) {
	int l = 0, r = n - 1, r_pos = -1;
	while (l <= r) {
		int mid = l + (r - l) / 2;
		if (mat[mid][0] == x) return 1;
		else if (mat[mid][0] > x) r = mid - 1;
		else {
			r_pos = mid;
			l = mid + 1;
		}
	}

	if (r_pos != -1) {
		for (int i = 0; i < m; i++) 
			if (mat[r_pos][i] == x)
				return 1;
	}

    return 0;
}