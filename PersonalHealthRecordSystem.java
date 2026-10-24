import java.util.*; 
class Patient { 
int id; 
String name; 
int age; 
5. SOURCE CODE 
String bloodGroup; 
    String diagnosis; 
 
    Patient(int id, String name, int age, String bloodGroup, String diagnosis) { 
        this.id = id; 
        this.name = name; 
        this.age = age; 
        this.bloodGroup = bloodGroup; 
        this.diagnosis = diagnosis; 
    } 
 
    void display() { 
        System.out.println("ID: " + id); 
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age); 
        System.out.println("Blood Group: " + bloodGroup); 
        System.out.println("Diagnosis: " + diagnosis); 
        System.out.println("---------------------------"); 
    } 
} 
 
public class PersonalHealthRecordSystem { 
    static ArrayList<Patient> patients = new ArrayList<>(); 
    static Scanner sc = new Scanner(System.in); 
 
    public static void main(String[] args) { 
        int choice; 
 
        do { 
            System.out.println("\n--- Personal Health Record System ---"); 
            System.out.println("1. Add Patient Record"); 
            System.out.println("2. View All Records"); 
            System.out.println("3. Search Patient by ID"); 
            System.out.println("4. Exit"); 
            System.out.print("Enter your choice: "); 
            choice = sc.nextInt(); 
 
            switch (choice) { 
                case 1: 
                    addPatient(); 
                    break; 
                case 2: 
                    viewPatients(); 
                    break; 
                case 3: 
                    searchPatient(); 
                    break; 
                case 4: 
                    System.out.println("Exiting system..."); 
                    break; 
                default: 
                    System.out.println("Invalid choice!"); 
            } 
        } while (choice != 4); 
    } 
 
    static void addPatient() { 
        System.out.print("Enter ID: "); 
        int id = sc.nextInt(); 
        sc.nextLine(); // clear buffer 
 
        System.out.print("Enter Name: "); 
        String name = sc.nextLine(); 
 
        System.out.print("Enter Age: "); 
        int age = sc.nextInt(); 
        sc.nextLine(); 
 
        System.out.print("Enter Blood Group: "); 
        String bloodGroup = sc.nextLine(); 
 
        System.out.print("Enter Diagnosis: "); 
        String diagnosis = sc.nextLine(); 
 
        patients.add(new Patient(id, name, age, bloodGroup, diagnosis)); 
        System.out.println("Patient record added successfully!"); 
    } 
 
    static void viewPatients() { 
        if (patients.isEmpty()) { 
            System.out.println("No records found."); 
            return; 
        } 
 
        for (Patient p : patients) { 
            p.display(); 
        } 
    } 
 
    static void searchPatient() { 
        System.out.print("Enter Patient ID to search: "); 
        int id = sc.nextInt(); 
 
        boolean found = false; 
        for (Patient p : patients) { 
            if (p.id == id) { 
                p.display(); 
                found = true; 
                break; 
            } 
        } 
 
        if (!found) { 
            System.out.println("Patient not found!"); 
        } 
    } 
} 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
