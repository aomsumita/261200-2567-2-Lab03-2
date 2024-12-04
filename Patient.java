public class Patient {
    private int id;
    private String name ;
    private int birthYear ;
    private double height ;
    private double weight ;
    private String bloodGroup;
    private String phoneNumber ;

    public Patient (int id, String name, int birthYear, double height, double weight , String bloodGroup ,String phoneNumber) {
        this.id = id;
        this.name = name;

        if (birthYear > 0) {
            this.birthYear = birthYear;
        } else {
            System.out.println("Birth Year can not be zero or negative");
            this.birthYear = 2000;
        }

        if (height > 0) {
            this.height = height;
        }else {System.out.println("Height can not be zero or negative");
            this.height = 180.0;
        }

        if (weight > 0) {
            this.weight = weight;
        }else {System.out.println("Weight can not be zero or negative");
            this.weight = 70.0;
        }
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber ;
    }
    public int getAge(int currentYear) {
        if (currentYear > birthYear) {
            return currentYear - birthYear;
        } else {
            System.out.println("Invalid current year. Returning age as 0.");
            return 0;
        }
    }
    public double getBMI(){
        if(height <= 0.00 || weight <= 0.00){
            return 0.00 ;
        }
        double heightMeters = height / 100;
        return weight/ (heightMeters * heightMeters) ;
    }
    public String getBloodGroup (String BloodGroup) {
        return BloodGroup ;
    }
    public String getphoneNumber (String phoneNumber) {
        return phoneNumber ;
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient bloodGroup: " + getBloodGroup(bloodGroup));
        System.out.println("Patient phoneNumber: " + getphoneNumber(phoneNumber));
        System.out.println("Patient BMI: " + getBMI());
    }
}


