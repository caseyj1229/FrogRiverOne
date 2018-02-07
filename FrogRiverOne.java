//https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
public class FrogRiverOne {
    public static int solution(int X, int[] A){
        int[] leaves = new int[X];
        int second = 0;
        for(int i = 0; i<A.length; i++){
            leaves[A[i]-1]++;
            if(leaves[A[i]-1] == 1){
                second = i;
            }
        }

        for(int i =0; i<leaves.length;i++){
            if(leaves[i] < 1){
                return -1;
            }
        }
        return second;
    }
}
