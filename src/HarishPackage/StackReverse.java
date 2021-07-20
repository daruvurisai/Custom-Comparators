package HarishPackage;
import java.util.Stack;
public class StackReverse{
    static Stack<Character> st = new Stack<>();
    static void pushAtButtom(char x){
        if(st.isEmpty()){
            st.push(x);
        }
        else{
            char a = st.peek();
            st.pop();
            pushAtButtom(x);
            st.push(a);
        }
    }

    static void reverse(){
        if(st.size()>0){
            // Hold all items in Function  Call Stack until we reach end of the stack
            char x = st.peek();
            st.pop();
            reverse();
            // Insert all the items held  in Function Call Stack  one by one from the bottom to top. Every item is inserted at the bottom.
            pushAtButtom(x);
        }
    }

    public static void main(String[] srgs) {
        st.push('H');
        st.push('A');
        st.push('R');
        st.push('I');
        st.push('S');
        st.push('H');
        System.out.println("Original Stack");
        System.out.print(st);
        reverse();
        System.out.println("\n");
        System.out.print("Reversed Stack\n");
        System.out.println(st);

    }
}