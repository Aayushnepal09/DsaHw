package Week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ExprassionTest {

    @org.junit.jupiter.api.Test
    void expression() {
    }

    @org.junit.jupiter.api.Test
    void main() {

    }

        @Test
        void test1() {
            Exprassion obj = new Exprassion(15,new int[]{3,4,3});
            assertEquals(obj.output,"3+4*3 3*4+3 ");

        }

        @Test
        void test2() {
            Exprassion obj = new Exprassion(6,new int[]{1,2,3});
            assertEquals(obj.output,"1+2+3 1*2*3 ");

        }

        @Test
        void test3() {
            Exprassion obj = new Exprassion(20,new int[]{7,2});
            assertEquals(obj.output,"There cannot be any combination of +,-,* with input array : [7, 2] to reach target : 20");

        }


    }


