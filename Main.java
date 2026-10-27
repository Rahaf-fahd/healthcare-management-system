package projectus;

public class Main {
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor(1134, "Dr.Retaj", "0555874531", "Cardiology");
        Patient patient1 = new Patient(100, "Rahaf", "0553687592", "1234567890");

        HealthRecord hr = patient1.getHealthRecord();
        hr.addDiagnosis("High blood pressure");
        hr.addDiagnosis("High cholesterol");
        
        hr.addMedication("Atorvastatin 20mg");
        hr.addMedication("Amlodipine 5mg");

        hr.addNote("Patient is improving.");
        hr.addNote("Schedule next appointment after 2 weeks.");

        Appointment appointment1 = new Appointment(5001,patient1, doctor1, "2025-12-01","10:30 AM");

        System.out.println("\n Doctor Information ");
        System.out.println(doctor1.getRoleDescription());
        System.out.println(doctor1.toString());

        System.out.println("\n Patient Information ");
        System.out.println(patient1.getRoleDescription());
        System.out.println(patient1.toString());

        System.out.println("\n Appointment Information ");
        System.out.println(appointment1.toString());

        System.out.println("\n Health Record ");
        System.out.println(hr.toString());
    }
}
