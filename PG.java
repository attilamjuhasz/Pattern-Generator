public class PG{
    public static void main(String[] args){

        //stars(7);
        //triangle(9);
        //odds(9);
        eo(6);

    }



    public static void eo(int maxE){
        if (maxE % 2 == 0){
            

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