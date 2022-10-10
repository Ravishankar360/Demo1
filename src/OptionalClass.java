import java.util.Optional;

public class OptionalClass {

    public static void main (String[] args){
        String [] str = new String[10];
        Optional<String> checknull= Optional.ofNullable(str[5]);
        str[5] = "Welcome to java 8 added";
        if(checknull.isPresent()){
            String LowCase= str[5].toLowerCase();
            System.out.println(LowCase);
        }else {
            System.out.println("String value not present");
        }


    }
}
