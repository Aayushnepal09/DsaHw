package Week4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class LineLengthTest {

    @Test
    void test() {

        int num[][] = { {1,2}, {5,5}, {1,4}, {2,3}, {3,2}, {4,1}, {3,5} };

        ArrayList<ArrayList<int[]>> allCollinearPoints = LineLength.findAllCollinearPoints(num);
        ArrayList<int[]> maxPointsInSameLine = LineLength.findMaxPointsInALine(allCollinearPoints);
        double length = LineLength.findLengthOfLine(maxPointsInSameLine);
        assertEquals(length,Math.sqrt(18));

    }

}