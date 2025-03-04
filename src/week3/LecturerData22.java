package week3;

public class LecturerData22 {

    public static void showAllLecturerData(Lecturer22[] lecturerArray) {
        for (Lecturer22 lecturer : lecturerArray) {
            System.out.println("ID: " + lecturer.id + ", Name: " + lecturer.name +
                               ", Gender: " + (lecturer.gender ? "Male" : "Female") +
                               ", Age: " + lecturer.age);
        }
    }

    public static int countLecturerByGender(Lecturer22[] lecturerArray, boolean gender) {
        int count = 0;
        for (Lecturer22 lecturer : lecturerArray) {
            if (lecturer.gender == gender) {
                count++;
            }
        }
        return count;
    }

    public static double averageLecturerAgeByGender(Lecturer22[] lecturerArray, boolean gender) {
        int totalAge = 0;
        int count = 0;
        for (Lecturer22 lecturer : lecturerArray) {
            if (lecturer.gender == gender) {
                totalAge += lecturer.age;
                count++;
            }
        }
        return count == 0 ? 0 : (double) totalAge / count;
    }

    public static void showOldestLecturerInfo(Lecturer22[] lecturerArray) {
        Lecturer22 oldest = lecturerArray[0];
        for (Lecturer22 lecturer : lecturerArray) {
            if (lecturer.age > oldest.age) {
                oldest = lecturer;
            }
        }
        System.out.println("Oldest Lecturer: " + oldest.name + " (Age: " + oldest.age + ")");
    }

    public static void showYoungestLecturerInfo(Lecturer22[] lecturerArray) {
        Lecturer22 youngest = lecturerArray[0];
        for (Lecturer22 lecturer : lecturerArray) {
            if (lecturer.age < youngest.age) {
                youngest = lecturer;
            }
        }
        System.out.println("Youngest Lecturer: " + youngest.name + " (Age: " + youngest.age + ")");
    }
}