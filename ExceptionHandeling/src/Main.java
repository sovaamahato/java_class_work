public class Main {
    public static void main(String[] args) {
        try{
            int divider =0;
            int value =100;
            int result = value/divider;
            System.out.println("Result is :"+ result);
            //when you already know yo thau ma error aauxa you can use ---throw
//            if(divider==0)
//            {
//                throw new Exception("error aaisakyo yei aba tala jana pardaina");
//
//            }

        }catch (Exception e){
            System.out.println("Error aayo");
        }finally { //error aaosh na aaosh yo block execute hunxa
            System.out.println("this is finally wala block");
        }

        anotherWork();

    }

    static void anotherWork(){
        System.out.println("another value");
    }
}