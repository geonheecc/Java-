package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,283,648 ~ 2,147,283,647 (약 20억)

        long l = 2831283812832821L; // 20억 이상

        //실수
        float f = 10.0f;
        double d = 10.0; // float 보다 더 큰 범위, 정밀도도 더 높음

    }
}
