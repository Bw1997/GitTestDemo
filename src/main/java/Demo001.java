import java.util.Random;
//线上修改
public class Demo001 {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            Random r = new Random();
            System.out.println(r.nextInt(100));
        }
    }
}
