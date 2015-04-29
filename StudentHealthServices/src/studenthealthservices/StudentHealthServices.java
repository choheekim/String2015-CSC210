package studenthealthservices;

/**
 * Class Assignment
 * @topic Classes and Methods
 * @name Assignment #11
 * @date 04202015
 * @author Chohee Kim
 */

public class StudentHealthServices {
    
    public static String AbnormalorNot (boolean trueorfalse) {
        if(trueorfalse) {
            return "normal";
        }else{
            return "abnormal";
        }
    }

    public static void main(String[] args) {
        //Print number of patient records
        System.out.println("Number of patient record(s) : " + EMR.numOfPatient);
        
        //create 5 new patient records.
        EMR patient1 = new EMR("Chohee Kim","02111992");
        EMR patient2 = new EMR("Marin Staykov","07151988");
        EMR patient3 = new EMR("John Grace","01221987");
        EMR patient4 = new EMR("Mark Price","05231987");
        EMR patient5 = new EMR("David Cavitt","04251976");
        
        //Print updated number of patient records.
        System.out.println("Updated number of patient record(s) : " + EMR.numOfPatient + "\n");     
        
        //Simulate a visit to the SHS for 3 out of 5 patients.
        
        patient1.setReasonForVisit("Diabets");
        patient1.setBodytem(98.3);
        patient1.setHeartRate(92);
        patient1.setDiagnosis("Unexplained weight loss and dizzy");
        patient1.setPreMedicine("Insulin");
        
        System.out.println("_________________________________________");
        System.out.println("Patient  #1 \n" + patient1.toString());
        System.out.println("Red flags : " + AbnormalorNot(patient1.redFlags(patient1.bodyTem, patient1.heartRate)));
        
        patient2.setReasonForVisit("Severe Cold");
        patient2.setBodytem(99.8);
        patient2.setHeartRate(92);
        patient2.setDiagnosis("Continuous cough and have chills");
        patient2.setPreMedicine("Tylenol Cold");
        
        System.out.println("_________________________________________");
        System.out.println("Patient  #2 \n" + patient2.toString());
        System.out.println("Red flags : " + AbnormalorNot(patient2.redFlags(patient2.bodyTem, patient2.heartRate)));
        
        patient3.setReasonForVisit("Broken leg");
        patient3.setBodytem(98.7);
        patient3.setHeartRate(72);
        patient3.setDiagnosis("Pain in leg that is broke");
        patient3.setPreMedicine("Pain medicine");
        
        System.out.println("_________________________________________");
        System.out.println("Patient  #3 \n" + patient3.toString());
        System.out.println("Red flags : " + AbnormalorNot(patient1.redFlags(patient3.bodyTem, patient3.heartRate)));
        
        
    }

}

