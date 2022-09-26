

public class Main {

    static String Access = "You have Access";
    static String Denied = "You dont have access";

    static String TOOold = "You dont have access";
    static String TOOyoung = "You dont have access";
//
///////


    public static void main(String[] args) {
        System.out.println(checkAge(144));
        System.out.println(checkAge1(19));

    }

        public static String checkAge(int Age){
         if (Age>=18) {
             return Access;
         }else
             return Denied;

        }
           public  static String checkAge1(int Age1){

        if(Age1>= 77){
            return TOOold;

        }else
            return TOOyoung;

               }
           }







