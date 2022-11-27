public int[] seriesUp(int n) {
    int length = n*(n+1)/2;
    int[] series = new int[length];
    int idx=0;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            series[idx++] = j;
        }
    }
    return series;
}
