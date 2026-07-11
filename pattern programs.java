//1
public class StarPattern1 {

    public static void main(String[] args){

        for(int i=1;i<=5;i++){

            for(int j=1;j<=i;j++)
                System.out.print("*");

            System.out.println();
        }
    }
}

//2
public class NumberPattern {

    public static void main(String[] args){

        for(int i=1;i<=5;i++){

            for(int j=1;j<=i;j++)
                System.out.print(j);

            System.out.println();
        }
    }
}

//3 
public class ReverseStarPattern {

    public static void main(String[] args){

        for(int i=5;i>=1;i--){

            for(int j=1;j<=i;j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
