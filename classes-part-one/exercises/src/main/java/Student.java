public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId) {
                this.name = name;
                this.studentId = studentId;
        }

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public String getName(){
                return name;
        }
        public int getStudentId(){
                return studentId;
        }
        public int getNumberOfCredits(){
                return numberOfCredits;
        }
        public double getGpa(){
                return gpa;
        }

        protected void setName(String aName) {
                name = aName;
        }

        public void setStudentId(int aStudentId) {
                studentId = aStudentId;
        }

        public void setNumberOfCredits(int aNumberOfCredits) {
                numberOfCredits = aNumberOfCredits;
        }

        public void setGpa(double aGpa) {
                gpa = aGpa;
        }

        public String toString() {
                return  "\tStudent Name\t: " + this.name +"\n" +
                        "\tStudent Id\t\t: " + this.studentId +"\n" +
                        "\tNo Of Credits\t: " + this.numberOfCredits +"\n" +
                        "\tStudent GPA\t\t: " + this.gpa +"\n";
        }
}
