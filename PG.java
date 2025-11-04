public class PG{
    public static void main(String[] args){

        stars(7);

    }
    public static void stars(int rows){
            String stars = "";
            System.out.println("*");
            for (int i = 1; i <= rows -1; i++){
                stars += "**";
                System.out.println(stars);
            }
        }
}