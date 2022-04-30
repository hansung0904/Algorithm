package practice;

public class Practice {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;
        System.out.println("j=i++; 실행후, i=" + i + ", j=" + j);

        i = 5;
        j = 0;

        j = ++i;
        System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
    }
}

/*
    j = ++i; // 전위형
    ++i; // 증가후에
    j = i; // 참조하여 대입

    j = i++; // 후위형
    j = i; // 참조하여 대입후에
    i++; // 증가
 */