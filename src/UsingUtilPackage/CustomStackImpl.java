package UsingUtilPackage;

public class CustomStackImpl {

    public static void main(String[] args)
    {
        CustomStack<Character> stack = new CustomStack<>();

        stack.push('A');
        stack.push('B');
        stack.push('H');
        stack.push('I');
        stack.push('N');
        stack.push('A');
        stack.push('V');


        System.out.println(stack);

        System.out.println( stack.pop() );
        System.out.println( stack.pop() );
        System.out.println( stack.pop() );
        System.out.println( stack.pop() );
        System.out.println( stack.pop() );
        System.out.println( stack.pop() );
        System.out.println( stack.pop() );



    }
}
