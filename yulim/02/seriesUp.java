public int[] seriesUp(int n) {
    int[] arr = new int[n*(n+1)/2];
    int size = n*(n+1)/2;
    for(int i=size-1, j=n, sub=1; i>=0; i--,j--) {
        if(j==0) {
            j=n-sub;
            sub++;
        }
        arr[i] = j;
    }
    return arr;
}

