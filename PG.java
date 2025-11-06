public class PG{
    public static void main(String[] args){

        //stars(7);
        //triangle(9);
        //odds(9);
        //eo(5);
        pyramid(5);

    }


    public static void pyramid(int rows){
        String nums = "";
        int rep = rows;
        for (int i = 1; i <= rows; i++){
            for (int j = (2 * rep)-1; j > 0; j--){
                nums = nums + i;
            }
            rep--;
            System.out.println(nums);
            nums = "";
        }
    }






















    public static void eo(int maxE){
        String letters = "";
        int total = maxE * 2;
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