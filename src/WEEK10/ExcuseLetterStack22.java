package WEEK10;

public class ExcuseLetterStack22 {
    ExcuseLetter22[] stack;
    int top;
    int size;
    
    public ExcuseLetterStack22(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new ExcuseLetter22[size];
    }
    
    public boolean isFull() {
        return top == size - 1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public void push(ExcuseLetter22 letter) {
        if (!isFull()) {
            top++;
            stack[top] = letter;
        } else {
            System.out.println("Stack is already full!!");
        }
    }
    
    public ExcuseLetter22 pop() {
        if (!isEmpty()) {
            ExcuseLetter22 letter = stack[top];
            top--;
            return letter;
        } else {
            System.out.println("Stack is empty - no letters to process");
            return null;
        }
    }
    
    public ExcuseLetter22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty - no letters to view");
            return null;
        }
    }
    
    public boolean searchByName(String name) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}