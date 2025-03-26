package Student;

class TopStudentsSorting {
    StudentSorting[] listStudents;
    int idx;

    public TopStudentsSorting(int size) {
        listStudents = new StudentSorting[size];
        idx = 0;
    }

    public void add(StudentSorting student) {
        if (idx < listStudents.length) {
            listStudents[idx] = student;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listStudents[i].print();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listStudents[j].gpa < listStudents[j + 1].gpa) {
                    StudentSorting temp = listStudents[j];
                    listStudents[j] = listStudents[j + 1];
                    listStudents[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listStudents[j].gpa < listStudents[minIndex].gpa) {
                    minIndex = j;
                }
            }
            StudentSorting temp = listStudents[minIndex];
            listStudents[minIndex] = listStudents[i];
            listStudents[i] = temp;
        }
    }
}