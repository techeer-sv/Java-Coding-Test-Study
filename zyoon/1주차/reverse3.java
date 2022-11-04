public int[] reverse3(int[] array){

    int[] narray = new int[3];
    for(i=0; i<3; i++){
        narray[i] = array[2-i];
    }
    return narray;

}