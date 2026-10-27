package projectus;

public class Patient extends Person {

    private String nationalId;
    private HealthRecord healthRecord;

    public Patient(int id, String name, String phone, String nationalId) {
        super(id, name, phone);
        this.nationalId = nationalId;
        this.healthRecord = new HealthRecord(nationalId);
    }

    public HealthRecord getHealthRecord() {
        return healthRecord;
    }

    @Override
    public String getRoleDescription() {
        return "This person is a patient receiving medical care.";
    }

   
    public String toString() {
        return super.toString() + ", National ID: " + nationalId + "\n--- Health Record ---\n" + healthRecord.toString();
    }
}
