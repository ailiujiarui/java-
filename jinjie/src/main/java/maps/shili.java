package maps;

import java.util.HashMap;
import java.util.Scanner;

public class shili {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        cishu(s);*/

    }
    public static void cishu(String s) {
        char[] array = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        /*for (int i = 0; i < array.length; i++) {
            map.put(array[i], 0);
        }
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 'a':
                    map.put('a', map.get('a')+1);
                break;
                case 'b':
                    map.put('b', map.get('b')+1);
                    break;
                    case 'c':
                        map.put('c', map.get('c')+1);
                        break;
                        case 'd':
                            map.put('d', map.get('d')+1);
                            break;
                            case 'e':
                                map.put('e', map.get('e')+1);
                                break;

            }
        }*/
        //优化写法
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);

            }
            else {
                map.put(array[i], 1);
            }
        }
        //System.out.println("a"+map.get('a')+"b"+map.get('b')+"c"+map.get('c')+"d"+map.get('d')+"e"+map.get('e'));
        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> {sb.append(k).append("次数为").append(v).append("\n");});
        System.out.println(sb);
    }
}
