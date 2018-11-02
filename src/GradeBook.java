class GradeBook {
    int[] math;
    int[] english;
    int[] iTScience;
    int[] physics;

    public GradeBook(int[] math, int[] english, int[] iTScience, int[] physics) {
        this.math = math;
        this.english = english;
        this.iTScience = iTScience;
        this.physics = physics;
    }

    double getAvgMath() {
        int sum = 0;
        for(int grade : math) {
            sum += grade;
        }
        return (double) sum / math.length;
    }

    double getAvgEnglish() {
        int sum = 0;
        for(int grade : english) {
            sum += grade;
        }
        return (double) sum / english.length;
    }

    double getAvgITScience() {
        int sum = 0;
        for(int grade : iTScience) {
            sum += grade;
        }
        return (double) sum / iTScience.length;
    }

    double getAvgPhysics() {
        int sum = 0;
        for(int grade : physics) {
            sum += grade;
        }
        return (double) sum / physics.length;
    }

    double getAvgTotal() {
        return (getAvgMath() + getAvgEnglish() + getAvgITScience() + getAvgPhysics()) / 4;
    }
}