import java.util.function.Function;

public class Demo1 {
    static Function<String,String> toUppercaseLambda= (s) -> s.toUpperCase();
    static Function<String,String> toUppercaseLambdaMethod_Refrence= String::toUpperCase;
    public static void main(String[] args){
        System.out.println(toUppercaseLambda.apply("Java 8"));
        System.out.println(toUppercaseLambdaMethod_Refrence.apply("Java 8"));
    }
}
