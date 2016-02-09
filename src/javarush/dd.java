package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pc on 09.02.2016.
 */
public class dd {
    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int array1[]=new int[10];
    for(int i = 0;i<array1.length;i++){
        array1[i]= Integer.parseInt(reader.readLine());
    }
    for(int i=0;i<array1.length;i++){
        int x=1;
        array1[i]= array1.length-x;
        x++;
    }
    for(int x:array1){
        System.out.println(x);
    }
}
}
