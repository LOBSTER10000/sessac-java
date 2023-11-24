package _04_class._06_pack06;

public class Java extends Develop{
    private String database;

    public Java(){
       super();
    }

    public Java(String language, String backend, String frontend, String orm, int since){
        super(language, backend, frontend, orm, since);
    }

    public String getDatabase(){
        return database;
    }

    public void setDatabase(String database){
        this.database = database;
    }

    @Override
    public void makeByDevelop(){
        System.out.println("===========JAVA의 정보==============");
        setDatabase("Mysql");
        System.out.println("언어는 : " + getLanguage());
        System.out.println("백엔드는 : " + getBackend());
        System.out.println("프론트엔드는 : " + getFrontend());
        System.out.println("ORM같은 경우에는 : "+ getOrm());
        System.out.println("DB는 : " + getDatabase());
    }

    public void makeOOP(){
        System.out.println("자바는 객체지향 프로그래밍 언어입니다!");
    }
}
