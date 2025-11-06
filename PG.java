//
//  Class author:  Attila Juhasz
//  Date created:  11/4/25
//  General description: This class creates different types of patterns based on inputs. Each method creates a different type of pattern based on the input you give it.
//




public class PG{
    public static void main(String[] args){

        stars(7);

        triangle(9);
        
        odds(9);
        
        eo(5);
        
        pyramid(5);

    }

//
//  Pre-condition: There must be an input of a random integer ranging from 1-9. Any input above that with give a weird patter due to double digits.
//  Post-condition: The result of this is a patter where each line in the console increases the number in the patter by 1. In each rows, there will be one less than twice as much of the max rows. The amount of digits in each row decreases by 2. There will also be an increasing amount of spaces added to the front of each row, starting with 0.
//

    public static void pyramid(int rows){
        String nums = "";
        int rep = rows;
        int spaces = 0;
        int end = 0;
        for (int i = 1; i <= rows; i++){
            for (int j = (2 * rep)-1; j > 0; j--){
                for (int k = spaces; k > end; k--){
                    nums += " ";
                }
                end = spaces;
                nums = nums + i;
            }
            end = 0;
            spaces++;
            rep--;
            System.out.println(nums);
            nums = "";
        }
    }

//
//  Pre-condition: You must give any interger ranging from 1 to infinity.
//  Post-condition: You will get a pattern where you starts with either E or O in the first line, depending on whether the integer is odd or even. Then, each row alternates between O and E, increasing the amount of E/O by two until it reaches then inputted int. Then, it decreases by twos, alternating between E/O until it reaches 1.
//
    public static void eo(int maxE){
        String letters = "";
        if (maxE % 2 == 0){
            for (int i = 1; i <= maxE; i++){
                if (i % 2 != 0){
                    for (int j = 0; j < i; j++){
                        letters += "O";
                    }
                    System.out.println(letters);
                    letters = "";
                }
                else if (i % 2 == 0){
                    for (int k = 0; k < i; k++){
                        letters += "E";
                    }
                    System.out.println(letters);
                    letters = "";
                }
            }

            for (int l = maxE - 1; l > 0; l--){
                if (l % 2 != 0){
                    for (int m = 0; m < l; m++){
                        letters += "O";
                    }
                    System.out.println(letters);
                    letters = "";
                }
                else{
                    for (int n = 0; n < l; n++){
                        letters += "E";
                    }
                    System.out.println(letters);
                    letters = "";
                }
            }
        }
        else{
            for (int i = 1; i <= maxE; i++){
                if (i % 2 != 0){
                    for (int j = 0; j < i; j++){
                        letters += "E";
                    }
                    System.out.println(letters);
                    letters = "";
                }
                else if (i % 2 == 0){
                    for (int k = 0; k < i; k++){
                        letters += "O";
                    }
                    System.out.println(letters);
                    letters = "";
                }
            }

            for (int l = maxE - 1; l > 0; l--){
                if (l % 2 != 0){
                    for (int m = 0; m < l; m++){
                        letters += "E";
                    }
                    System.out.println(letters);
                    letters = "";
                }
                else{
                    for (int n = 0; n < l; n++){
                        letters += "O";
                    }
                    System.out.println(letters);
                    letters = "";
                }
            }
        }

    }

//
//  Pre-condition: You must input an odd integer and have it be less than 11.
//  Post-condition: This will give you a pattern where the first row starts with the given odd number, and each following row decreases the number value by 2. The amount of digits also decrease by two until it reach 1.
//
    public static void odds(int start){
        String sOdd = "";
        for (int i = start; i > 0; i-=2){
            for (int j = 0; j < i; j++){
                sOdd += i;
            }
            System.out.println(sOdd);
            sOdd = "";
        }

    }

    public static void triangle(int rows){
        int num = 1;
        System.out.println(num);
        String line = "";
        int i = 0;
        while (num < rows){
            num++;
            String sNum = "" + num;
            while (i < num){

                line += sNum;
                i++;
            }
            i = 0;
            System.out.println(line);
            line = "";
            
        }
    }

    public static void stars(int rows){
            String stars = "*";
            System.out.println("*");
            int i = 1;
            while (i <= rows -1){
                stars += "**";
                System.out.println(stars);
                i++;
            }
        }
}