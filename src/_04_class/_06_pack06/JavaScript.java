package _04_class._06_pack06;

public class JavaScript extends Develop{
    private String library;
    
    public JavaScript(){
        super();
    }
    
    public JavaScript(String language, String backend, String frontend, String orm, int since){
        super(language, backend, frontend, orm, since);
    }

    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library;
    }


    @Override
    public void makeByDevelop(){
        System.out.println("===========JavaScript의 정보==============");
        setLibrary("부트스트랩");
        System.out.println("언어는 : " + getLanguage());
        System.out.println("백엔드는 : " + getBackend());
        System.out.println("프론트엔드는 : " + getFrontend());
        System.out.println("ORM같은 경우에는 : "+ getOrm());
        System.out.println("라이브러리는 : " + getLibrary());
    }
    
    public void makeEvent(){
        System.out.println("자바스크립트의 Node.js는 이벤트루프 기반의 언어입니다");
    }
    
}
