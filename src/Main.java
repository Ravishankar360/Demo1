public class Main
{
    public static void main(String[] args){
        Display d = new Display() {
            @Override
            public void show() { System.out.println("Welcome Show Method");
            }
        };

        System.out.println();
        d.show();
    }
}
