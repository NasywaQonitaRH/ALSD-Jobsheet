package WEEK10;

public class StudentAssignmentStack22 {
    Student22[] stack;
    int top;
    int size;
    
    public StudentAssignmentStack22(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new Student22[size];
    }
    
    public boolean isFull() {
        return top == size - 1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public void push(Student22 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!!");
        }
    }
    
    public Student22 pop() {
        if (!isEmpty()) {
            Student22 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }
    
    public Student22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }
    
    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
        }
        System.out.println("");
    }
    
    public String convertToBinary(int grade) {
        ConversionStack22 stack = new ConversionStack22();
        while (grade > 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary.isEmpty() ? "0" : binary; // Handle grade = 0 case
    }
}