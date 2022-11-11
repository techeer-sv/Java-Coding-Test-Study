public int[] seriesUp(int n) {
    int[] arr = new int[n*(n + 1)/2];
    
    int index = 0;
    
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= i; j++) {
            arr[index++] = j;
        }
    }
                                
    return arr;
}
