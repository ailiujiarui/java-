package zhengze;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class zhengze {
    public static void main(String []args){
        //正则表达式子的应用
        String qqregax="[1-9]\\d{4,11}";
        System.out.println("123456789101".matches(qqregax));
        String phone="1[3-9]\\d{9}";
        String email="\\w{6,8}[@][\\w&&[^_]{3,5}(\\.[a-z]{2,3})+";

        String data = "来黑马程序员学习Java，" +
                "电话：18666668888，18699997777或者联系" +
                "邮箱：boniu@itcast.cn 邮箱：bozai@itcast.cn 邮箱2：dlei0009@163.com" +
                "座机电话：01036517895，010-98951256 " +
                "热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";
        String regax="[1][3-9]\\d{9}|\\w+[@][\\w&&[^_]]+(\\.[a-z]{2,3})+|[0]\\d{2,3}-?\\d{7,8}|[4][0][0]-?[6][1][8]-?\\d{4}";
        Pattern pattern=Pattern.compile(regax);
        Matcher ma=pattern.matcher(data);
        while (ma.find()){
            System.out.println(ma.group());
        }

    }
}
