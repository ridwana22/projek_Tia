package MSIB.Projek.Entity;


public class StudentData {
    private float studyHoursPerDay;
    private float extracurricularHoursPerDay;
    private float sleepHoursPerDay;
    private float socialHoursPerDay;
    private float physicalActivityHoursPerDay;
    private float gpa;

    public StudentData(float studyHoursPerDay, float extracurricularHoursPerDay, float sleepHoursPerDay, float socialHoursPerDay, float physicalActivityHoursPerDay, float gpa) {
        this.studyHoursPerDay = studyHoursPerDay;
        this.extracurricularHoursPerDay = extracurricularHoursPerDay;
        this.sleepHoursPerDay = sleepHoursPerDay;
        this.socialHoursPerDay = socialHoursPerDay;
        this.physicalActivityHoursPerDay = physicalActivityHoursPerDay;
        this.gpa = gpa;
    }


    public float getStudyHoursPerDay() {
        return studyHoursPerDay;
    }

    public void setStudyHoursPerDay(float studyHoursPerDay) {
        this.studyHoursPerDay = studyHoursPerDay;
    }

    public float getExtracurricularHoursPerDay() {
        return extracurricularHoursPerDay;
    }

    public void setExtracurricularHoursPerDay(float extracurricularHoursPerDay) {
        this.extracurricularHoursPerDay = extracurricularHoursPerDay;
    }

    public float getSleepHoursPerDay() {
        return sleepHoursPerDay;
    }

    public void setSleepHoursPerDay(float sleepHoursPerDay) {
        this.sleepHoursPerDay = sleepHoursPerDay;
    }

    public float getSocialHoursPerDay() {
        return socialHoursPerDay;
    }

    public void setSocialHoursPerDay(float socialHoursPerDay) {
        this.socialHoursPerDay = socialHoursPerDay;
    }

    public float getPhysicalActivityHoursPerDay() {
        return physicalActivityHoursPerDay;
    }

    public void setPhysicalActivityHoursPerDay(float physicalActivityHoursPerDay) {
        this.physicalActivityHoursPerDay = physicalActivityHoursPerDay;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}