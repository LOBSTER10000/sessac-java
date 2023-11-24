package _04_class;

public class Develop {

    private String language;
    private String frameWork;
    private int since;
    private String dB;

    public Develop(){
        super();
    }

    public Develop(String language, String frameWork, int since, String dB){
        this.language = language;
        this.frameWork = frameWork;
        this.since = since;
        this.dB = dB;
    }

    public String getLanguage(){
        return language;
    }

    public String getFrameWork(){
        return frameWork;
    }

    public String getDB(){
        return dB;
    }

    public int getSince(){
        return since;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }

    public void setSince(int since) {
        this.since = since;
    }

    public void setdB(String dB) {
        this.dB = dB;
    }
}
