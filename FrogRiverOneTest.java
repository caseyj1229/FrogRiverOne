import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {
    @Test
    void solution() {
        int[] A = {1,3,1,4,2,3,5,4};
        assertEquals(6,FrogRiverOne.solution(5,A));

        int[] B = {1,2,3,4};
        assertEquals(-1,FrogRiverOne.solution(5,B));

        int[] C = {5,4,3,2,2,2,1};
        assertEquals(6,FrogRiverOne.solution(5,C));

    }
}