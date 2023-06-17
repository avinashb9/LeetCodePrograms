import java.awt.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RomanToInt {


    public static void main(String[] args){
//        int number = RomanToInt.romanToInt("CMXCVIII");
        int number = RomanToInt.type2("CMXCVIII");
        System.out.println(number);
        }


    public static int romanToInt(String s) {
        //using LinkedList
        int num = 0;
        char[] arr = s.toCharArray();
        // int[] numArr = new int[arr.length)]
        List<Integer> numList = new LinkedList<Integer>();
        //convert roman to number array
        for(int i=0;i<arr.length;i++){
            switch(String.valueOf(arr[i])){
                case "I":
                    numList.add(1);
                    break;
                case "V":
                    numList.add(5);
                    break;
                case "X":
                    numList.add(10);
                    break;
                case "L":
                    numList.add(50);
                    break;
                case "C":
                    numList.add(100);
                    break;
                case "D":
                    numList.add(500);
                    break;
                case "M":
                    numList.add(1000);
                    break;
            }
        }
        for(int i=0;i<numList.size();i++){
            int j = i + 1;
            if(j != numList.size() && numList.get(j)>numList.get(i)){
                num = num + (numList.get(j)-numList.get(i));
                i++;
            }else{
                num = num + numList.get(i);
            }
        }
        return num;

    }

    public static int type2(String s){
        //using hashmap
        int num = 0;
        char[] arr = s.toCharArray();
        Map<String,Integer> romans = new HashMap<>();
        romans.put("I",1);
        romans.put("V",5);
        romans.put("X",10);
        romans.put("L",50);
        romans.put("C",100);
        romans.put("D",500);
        romans.put("M",1000);
        for(int i=0;i<arr.length;i++){
            int j = i +1;
            if( j != arr.length && romans.get(String.valueOf(arr[j]))>romans.get(String.valueOf(arr[i]))){
                num = num + (romans.get(String.valueOf(arr[j])) - romans.get(String.valueOf(arr[i])));
                i++;
            }else {
                num = num + romans.get(String.valueOf(arr[i]));
            }
        }
        return num;
    }
}
