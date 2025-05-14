package Jobsheet11;

public class KRSQueue {
    private Student[] data;
    private int front, rear, size, max;
    private int totalProcessed;
    private final int MAX_PROCESSED = 30;

    public KRSQueue() {
        max = 10; // Maximum queue size
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
        totalProcessed = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Student dt) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            data[rear] = dt;
            size++;
            System.out.printf("%s (NIM: %s) added to KRS queue at position %d\n", 
                dt.name, dt.nim, size);
        } else {
            System.out.println("KRS queue is full! Please wait.");
        }
    }

    public Student[] dequeueTwo() {
        Student[] processed = new Student[2];
        if (size >= 2) {
            processed[0] = data[front];
            front = (front + 1) % max;
            size--;
            totalProcessed++;
            
            processed[1] = data[front];
            front = (front + 1) % max;
            size--;
            totalProcessed++;
            
            System.out.println("Processed 2 students:");
            processed[0].print();
            processed[1].print();
        } else if (size == 1) {
            processed[0] = data[front];
            front = (front + 1) % max;
            size--;
            totalProcessed++;
            
            System.out.println("Processed 1 student (only 1 in queue):");
            processed[0].print();
        } else {
            System.out.println("Queue is empty! No students to process.");
        }
        return processed;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Next student for KRS approval:");
            data[front].print();
        } else {
            System.out.println("No students in queue!");
        }
    }

    public void peekTwo() {
        if (size >= 2) {
            System.out.println("Next two students for KRS approval:");
            data[front].print();
            data[(front + 1) % max].print();
        } else if (size == 1) {
            System.out.println("Only one student in queue:");
            data[front].print();
        } else {
            System.out.println("No students in queue!");
        }
    }

    public void viewRear() {
        if (!isEmpty()) {
            System.out.println("Last student in queue:");
            data[rear].print();
        } else {
            System.out.println("No students in queue!");
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("No students in queue!");
            return;
        }
        System.out.println("Current KRS queue:");
        int i = front;
        int count = 0;
        while (count < size) {
            System.out.print((count + 1) + ". ");
            data[i].print();
            i = (i + 1) % max;
            count++;
        }
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("KRS queue has been cleared!");
    }

    public int getSize() {
        return size;
    }

    public int getRemaining() {
        return MAX_PROCESSED - totalProcessed;
    }

    public int getTotalProcessed() {
        return totalProcessed;
    }
}