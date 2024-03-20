public class main {

    public static void main(String[] args) {
        // Create an instance of Course
        course javaCourse1 = new course("Data Science", "Learn about data science", "John Doe", "All level", 150000);
        course javaCourse2 = new course("Algorithm", "Master of basic algorithm", "Enki", "Beginner", 75000);
        course javaCourse3 = new course("Decker", "Learn about docker from zero to master", "Ray Krieger", "All level", 125000);

        // Display course information
        javaCourse1.courses();
        javaCourse1.getInfo();

        javaCourse2.courses();
        javaCourse2.getInfo();

        javaCourse3.courses();
        javaCourse3.getInfo();

    }
}