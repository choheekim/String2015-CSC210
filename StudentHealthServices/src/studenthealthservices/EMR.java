package studenthealthservices;

public class EMR {

    //declares the data fileds.
    String name;
    String DOB;
    String reasonForVisit;
    double bodyTem;
    int heartRate;
    String diagnosis;
    String prescribedMed;
    static int numOfPatient = 0;

    //A container method that initializes only the first data fileds.
    public EMR(String newName, String newDOB) {
        name = newName;
        DOB = newDOB;
        numOfPatient++;
    }

    //A container method that initializes all the data fields.
    public EMR(String newName, String newDOB, String newReasonForVisit, double newBodyTem, int newHeartRate, String newDiagnosis, String newPrescribedMed) {
    
        name = newName;
        DOB = newDOB;
        reasonForVisit = newReasonForVisit;
        bodyTem = newBodyTem;
        heartRate = newHeartRate;
        diagnosis = newDiagnosis;
        prescribedMed = newPrescribedMed;
        numOfPatient++;
    }

    //all the necessary getter/setter methods.
    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public void setBodytem(double bodyTem) {
        this.bodyTem = bodyTem;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
    
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setPreMedicine(String prescribedMed) {
        this.prescribedMed = prescribedMed;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public double getTemp() {
        return bodyTem ;
    }
    
    public int getHeartRate() {
        return heartRate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getPreMedicine() {
        return prescribedMed;
    }
    
    //checks if the vitals are within normal range.
    public boolean redFlags(double bodyTemp, int heartRate) {      
        return (bodyTemp < 99.1 && bodyTemp > 97.3) 
                && (heartRate < 100 && heartRate > 60);
    }
    
    public String toString() {
        return "Name : " + name + "\nDay of Birth : " + DOB +
                "\nReason for visit : " + reasonForVisit + "\nTemperature : " + bodyTem +
                "\nHeart rate : " + heartRate + "\nDiagosis : " + diagnosis + "\nPrescripte medicine : " + prescribedMed;
    }
    

}
