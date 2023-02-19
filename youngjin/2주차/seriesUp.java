//CodingBat problems. omitting java main class.

public int[] seriesUp(int n) {
    int[] arr = new int [n*(n + 1)/2];
    int idx = 0;
    
    for(int i = 0; i < n; i++){
      for (int j = 1; j <=i+1; j++){
        arr[idx] = j ;
        idx ++;
      }
    }
    return arr;
  }