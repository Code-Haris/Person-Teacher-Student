public class TestPerson {
    public static void main(String[] args) {
        /* Test Student class */
        Student s1 = new Student("John Doe", "Kettenbruckegasse 15, 1150 Wien");
        s1.addCourseGrade("Java Course", 99);
        s1.addCourseGrade("JavaScript", 85);
        s1.printGrades();
        System.out.println("Average is " + s1.getAverageGrade());

        /* Test Teacher class */
        Teacher t1 = new Teacher("Philip", "Kettenbruckegasse 15, 1150 Wien");
        System.out.println(t1);
        String[] courses = {"Java Course", "JavaScript", "HTML"};
        for (String course: courses) {
            if (t1.addCourse(course)) {
                System.out.println(course + " added.");
            } else {
                System.out.println(course + " cannot be added.");
            }
        }
        for (String course: courses) {
            if (t1.removeCourse(course)) {
                System.out.println(course + " removed.");
            } else {
                System.out.println(course + " cannot be removed.");
            }
        }
    }
}