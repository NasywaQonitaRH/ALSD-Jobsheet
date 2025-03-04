package week3;

public class LecturerDataNoPresensi {

    public static void showAllLecturerData(LecturerNoPresensi[] lecturerArray) {
        for (LecturerNoPresensi lecturer : lecturerArray) {
            System.out.println("ID: " + lecturer.id + ", Name: " + lecturer.name +
                               ", Gender: " + (lecturer.gender ? "Male" : "Female") +
                               ", Age: " + lecturer.age);
        }
    }

    public static int countLecturerByGender(LecturerNoPresensi[] lecturerArray, boolean gender) {
        int count = 0;
        for (LecturerNoPresensi lecturer : lecturerArray) {
            if (lecturer.gender == gender) {
                count++;
            }
        }
        return count;
    }

    public static double averageLecturerAgeByGender(LecturerNoPresensi[] lecturerArray, boolean gender) {
        int totalAge = 0;
        int count = 0;
        for (LecturerNoPresensi lecturer : lecturerArray) {
            if (lecturer.gender == gender) {
                totalAge += lecturer.age;
                count++;
            }
        }
        return count == 0 ? 0 : (double) totalAge / count;
    }

    public static void showOldestLecturerInfo(LecturerNoPresensi[] lecturerArray) {
        LecturerNoPresensi oldest = lecturerArray[0];
        for (LecturerNoPresensi lecturer : lecturerArray) {
            if (lecturer.age > oldest.age) {
                oldest = lecturer;
            }
        }
        System.out.println("Oldest Lecturer: " + oldest.name + " (Age: " + oldest.age + ")");
    }

    public static void showYoungestLecturerInfo(LecturerNoPresensi[] lecturerArray) {
        LecturerNoPresensi youngest = lecturerArray[0];
        for (LecturerNoPresensi lecturer : lecturerArray) {
            if (lecturer.age < youngest.age) {
                youngest = lecturer;
            }
        }
        System.out.println("Youngest Lecturer: " + youngest.name + " (Age: " + youngest.age + ")");
    }
}