package labs.labs2_2;

public class Star {
    private String brightnes;
    private int distance;
    public static final int SPEED_LIGHT=101;
    public static int count ;

    public static int calculateSpeed(){
        return count;

    }

    public Star(String shine, int miles){
        brightnes = shine;
    }
    public Star(int miles) {
        distance = miles;
    }
    public String getBrightnes(){
        return brightnes;
    }
    public int getDistance(){
        return distance;
    }
    }
