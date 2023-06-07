package Task2.Seminal1.lesson4.model;

public class Teacher extends User implements Comparable<Teacher> {
    private Double gpa;
    private String advisor;

    public Teacher(Long id, String fullName, Integer age, String phoneNumber) {
        super(id, fullName, age, phoneNumber);
    }

    public int compareTo(Teacher o) {
        return this.getFullName().compareTo(o.getFullName());
    }

    public String toString() {
        return String.format("%s\t%s\t%s\t%s", this.getId(), this.getFullName(), this.getAge(), this.getPhoneNumber());
    }

    public Double getGpa() {
        return this.gpa;
    }

    public String getAdvisor() {
        return this.advisor;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Teacher)) {
            return false;
        } else {
            Teacher other = (Teacher)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (!super.equals(o)) {
                return false;
            } else {
                Object this$gpa = this.getGpa();
                Object other$gpa = other.getGpa();
                if (this$gpa == null) {
                    if (other$gpa != null) {
                        return false;
                    }
                } else if (!this$gpa.equals(other$gpa)) {
                    return false;
                }

                Object this$advisor = this.getAdvisor();
                Object other$advisor = other.getAdvisor();
                if (this$advisor == null) {
                    if (other$advisor != null) {
                        return false;
                    }
                } else if (!this$advisor.equals(other$advisor)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Teacher;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = super.hashCode();
        Object $gpa = this.getGpa();
        result = result * 59 + ($gpa == null ? 43 : $gpa.hashCode());
        Object $advisor = this.getAdvisor();
        result = result * 59 + ($advisor == null ? 43 : $advisor.hashCode());
        return result;
    }
}
