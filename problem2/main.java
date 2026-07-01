public class main {
    private String name;
    private int[] marks;

    public main(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / (double) marks.length;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        String name = scanner.nextLine();
        int numMarks = scanner.nextInt();
        int[] marks = new int[numMarks];
        
        for (int i = 0; i < numMarks; i++) {
            marks[i] = scanner.nextInt();
        }
        
        main student = new main(name, marks);
        System.out.println(student.calculateAverage());
        
        scanner.close();
    }
}
