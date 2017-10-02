package labs.labs2_2;

public class Hello {
    public static void main(String[] args ){
        Star star = new Star( "very bright Star", 14 );
        System.out.println(Star.count);
        System.out.println(Star.SPEED_LIGHT);
        System.out.println(star.getBrightnes() + "" + star.getDistance());
    }
}
