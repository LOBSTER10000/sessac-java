package _04_class._06_pack06;

public class Develop {
    private String language;
    private String backend;
    private String frontend;
    private String orm;
    private int since;

    public Develop() {
    }

    public Develop(String language, String backend, String frontend, String orm, int since) {
        this.language = language;
        this.backend = backend;
        this.frontend = frontend;
        this.orm = orm;
        this.since = since;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBackend() {
        return backend;
    }

    public void setBackend(String backend) {
        this.backend = backend;
    }

    public String getFrontend() {
        return frontend;
    }

    public void setFrontend(String frontend) {
        this.frontend = frontend;
    }

    public String getOrm() {
        return orm;
    }

    public void setOrm(String orm) {
        this.orm = orm;
    }

    public int getSince() {
        return since;
    }

    public void setSince(int since) {
        this.since = since;
    }

    @Override
    public String toString() {
        return "Develop {" +
                "language='" + language + '\'' +
                ", backend='" + backend + '\'' +
                ", frontend='" + frontend + '\'' +
                ", orm='" + orm + '\'' +
                ", since=" + since +
                '}';
    }

    public void makeDevelop(){
        System.out.println("개발을 시작하고자 합니다");
    }

    public void makeByDevelop(){

    }
}
