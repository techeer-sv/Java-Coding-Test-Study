// OOP Style Code
public boolean commonEnd(int[] a, int[] b) {
        validateArray(a, b);
        if(isSameFirstOrLast(a, b)){return true;}
        return false;
}

private boolean validateArray(int[] a, int[] b){
        if(validateLength(a, b)){return true;}
        return false;
}

private boolean validateLength(int[] a, int[] b){
        return a.length >= 1 || b.length >=1;
}

private boolean isSameFirstOrLast(int[] a, int[] b){
        int firstA = a[0];
        int lastA = a[a.length-1];
        int firstB = b[0];
        int lastB = b[b.length-1];

        if (firstA == firstB || lastA == lastB){return true;}
        return false;
}
