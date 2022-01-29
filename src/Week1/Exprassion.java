package Week1;

import java.util.Arrays;

public class Exprassion {
    // Creating variables
        public int k; //target value is k
        public int[] input; //integer array to hold any integers input
        public String output;
        public int count ;

        public Exprassion(int k, int[] input){ //constructor to initialize the values for target 'k' and array 'input'

            this.k=k;
            this.input=input;
            this.output="";
            count=0;
            expression(0,0,0," ");

        }

        //function to validate and print the valid expression
        public void expression(int position,int prev,int result, String expr) {
        //position = position in the array sequence
        //prev = previous number in case of multiply and previous result in case of add and subtract
        //result = result calculated so far
        //expr = resulting expression in String format





        //if position reaches max length check if
        //result reaches the target value k
        //if reaches print the expression and exit from the current parent method , exit anyway because the max array length is reached
            if(position==input.length) {
                if(result==k) {
                    output+=expr+' ';
                //output=output+expr+'';
                    count++;
                }
                return;

            }

        //keeping track of the number in the array based on position
            int nthnum = input[position];


        //for first iteration when the first number in the array is taken into account
            if(position==0) {
                expression(position+1,nthnum,nthnum,""+nthnum);
            }

        //for all the remaining cases after the first number in array is taken
            else{
                expression(position+1,nthnum,result+nthnum,expr+"+"+nthnum);
                expression(position+1,nthnum,result-nthnum,expr+"-"+nthnum);
                expression(position+1,prev*nthnum,result-prev+prev*nthnum,expr+"*"+nthnum);
            }

        //in case of no possible combination to react the output
            if(count==0) {
                output="There cannot be any combination of +,-,* with input array : " + Arrays.toString(input) + " to reach target : "+ k;
            }

        }
        public static void main(String[] args) {

            Exprassion obj=new Exprassion(15,new int[]{3,4,3});

            System.out.println(obj.output);

        }



    }

