package InnerClass;

class School {
    private String name;

    public School(String name) {
        this.name = name;
    }

    class Classroom {
        private int roomNumber;
        private String subject;

        public Classroom(int roomNumber, String subject) {
            this.roomNumber = roomNumber;
            this.subject = subject;
        }

        public void displayInfo() {
            System.out.println(name + " - Room " + roomNumber + ": " + subject + " class");
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        School mySchool = new School("Greenwood High");
        School.Classroom mathClass = mySchool.new Classroom(101, "Math");
        School.Classroom scienceClass = mySchool.new Classroom(102, "Science");
        mathClass.displayInfo();
        scienceClass.displayInfo();
    }
}