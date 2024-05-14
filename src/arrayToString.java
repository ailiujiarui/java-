public class arrayToString {
    public static  String arrayToString(int[] arr){
        StringBuilder str =new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
            //判断条件是输出逗号，到最后一位就不输出
            if (i< arr.length-1){
                str.append(",");
            }
        }
        str.append("]");
        return  str.toString();
    }
}
