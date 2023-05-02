package homeWork4;

public enum PROF {
    WORKER(2),
    DIRECTOR(3),
    TRAINEE(1);
    private int koef;

    PROF(int koef) {
        this.koef = koef;
    }
    public int getKoef() {
        return koef;
    }
}

