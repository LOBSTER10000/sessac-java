package test;

public class Score implements Comparable<Score> {
    private int math;
    private int eng;

    public Score(int math, int eng) {
        this.math = math;
        this.eng = eng;
    }

    public Score() {

    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    @Override
    public int compareTo(Score o) {
        if (this.eng != o.getEng()) {
            return o.getEng() - this.eng;
        } else {
            return o.getMath() - this.math;
        }
    }
}