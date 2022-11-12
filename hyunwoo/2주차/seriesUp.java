public int[] seriesUp(int n) {
  
  int[] arr = new int[n*(n+1)/2];
  int k=0;
  
  for(int i = 1; i <= n; i++)
  {
    int t = 1;
    while(t <= i)
    {
      arr[k++] = t++;
    }
  }
  return arr;
}
