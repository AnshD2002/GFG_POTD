class Solution {
long floorSqrt(long n) {
    
    long low = 1;
    long high = n;
    long ans = 0;
    while(low <= high){
        long mid = (low + high)/2;
        long sqr=mid * mid;
        if(sqr == n) return mid;
        if(sqr>n) high = mid - 1;
        else{ low = mid + 1; ans = mid; }
    }
    return ans;
    }
}
