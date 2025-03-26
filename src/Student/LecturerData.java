package Student;

class LecturerData {
    Lecturer[] lecturerData = new Lecturer[10];
    int idx = 0;

    void add(Lecturer dosen) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dosen;
            idx++;
        } else {
            System.out.println("Data is full!");
        }
    }

    void print() {
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIndex].age) {
                    maxIndex = j;
                }
            }
            Lecturer temp = lecturerData[maxIndex];
            lecturerData[maxIndex] = lecturerData[i];
            lecturerData[i] = temp;
        }
    }
}