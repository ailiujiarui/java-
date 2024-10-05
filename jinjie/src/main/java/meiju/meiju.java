package meiju;

public class meiju {
    public static void main(String[] args) {
        switch (Season.SPRING) {
            case SPRING:
                System.out.println("春天");
        }
    }
}
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER;
}