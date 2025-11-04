public class CoreJavaDemo {

    static String SwatiJoshi_data = "BCA Student Data";

    // Student class
    static class Student {
        String name;
        int rollNo;

        public Student(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }

        public String toString() {
            return "Name: " + name + ", Roll No: " + rollNo;
        }
    }

    // BCAStudent class
    static class BCAStudent extends Student {
        int semester;

        public BCAStudent(String name, int rollNo, int semester) {
            super(name, rollNo);
            this.semester = semester;
        }

        public String toString() {
            return super.toString() + ", Semester: " + semester;
        }
    }

    public static void main(String[] args) {
        System.out.println("Swati Joshi data : " + SwatiJoshi_data);

        // Array of 3 BCAStudent objects
        BCAStudent[] arr = new BCAStudent[3];
        arr[0] = new BCAStudent("Ankit Singh", 101, 3);
        arr[1] = new BCAStudent("Shristi Mishra", 205, 4);
        arr[2] = new BCAStudent("Siddharth Joshi", 407, 5);

        System.out.println("Printing student details:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Exception handling
        System.out.println("\nDemonstrating try-catch with ArrayIndexOutOfBoundsException:");
        try {
            // ArrayIndexOutOfBoundsException
            System.out.println("Accessing arr[5]: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Caught exception: " + ex);
        }

        // NumberFormatException
        System.out.println("\nDemonstrating NumberFormatException handling:");
        try {
            String badNumber = "12A34";
            int val = Integer.parseInt(badNumber); // will throw NumberFormatException
            System.out.println("Parsed value: " + val);
        } catch (NumberFormatException ex) {
            System.out.println("Caught exception: " + ex);
        }

    }
}
