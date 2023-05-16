public class NestedLoopPractice {
    public static void main(String[] args) {
        NestedLoopPractice n = new NestedLoopPractice();
    }

    public NestedLoopPractice(){
        pattern7b();


    }

    public void pattern1() {
        //code for pattern 1 goes here
        int num = 0;
        System.out.println("pattern 1");
        for (int i = 0; i < 5; i++) {
            num += 5;
            System.out.print(num + ", ");
        }
    }
    public void pattern2(){
        int num=2;
        System.out.println("pattern 2");
        for (int i=0;i<5;i++){
            num+=5;
            System.out.print(num + ", ");
        }
    }

    public void pattern3(){
        int num=25;
        System.out.println("pattern 3");
        for (int i=0;i<6;i++){
            num-=4;
            System.out.print(num + ", ");
        }
    }

    public void pattern4(){
        int num=0;
        System.out.println("pattern 4");
        for (int i=0;i<6;i++){
           num=num+1;
           System.out.print(num*num + " ");
        }
    }

    public void pattern5() {
    System.out.println("Pattern 5");
        for (int k = 0; k < 4; k++) {
            int num = 0;
            for (int i = 0; i < 4; i++) {
                num = num + 1;
                System.out.print(num + "\t ");
            }
            System.out.println(" ");
        }
    }

    public void pattern6(){
        System.out.println("Pattern 6");
        for (int a = 1; a < 6; a++){

            for (int b = 1; b < a; b++){
                System.out.print(" ");
            }
            System.out.println(a);

        }
    }

    public void pattern7(){
        System.out.println("Pattern 7");
        for (int a = 1; a < 6; a++){

            for (int b = 1; b < a; b++){
                System.out.print(a);
            }
            System.out.println(a);

        }
    }
    public void pattern8(){
        for (int i = 0; i < 5; i++) {  // Iterate over each row
            for (int j = 0; j < i; j++) {  // Print spaces before the stars
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++) {  // Print stars in the pattern
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }

        }

        public void pattern9(){
            int rows = 9;  // Number of rows in the pattern

            for (int i = 1; i <= rows; i++) {
                int spaces = Math.abs(i - (rows / 2 + 1));
                int stars = rows - 2 * spaces;

                // Print leading spaces
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }

                // Print stars or special characters
                for (int k = 1; k <= stars; k++) {
                    if (i == (rows / 2 + 1)) {
                    } else {
                        System.out.print("*");
                    }
                }

                System.out.println();  // Move to the next line
            }
        }
        public void pattern10(){
            int rows = 9; // Number of rows in the pattern

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows; j++) {
                    if (i == j || i + j == rows + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        public void pattern7b(){
            int rows = 5; // Number of rows in the pattern

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows - i + 1; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
    }
    public void pattern12(){
        //#                         #
        //# #                   # #
        //# # #             # # #
        //# # # #       # # # #
        //# # # # # # # # # #

    }


    }





