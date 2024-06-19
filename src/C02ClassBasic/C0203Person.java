package C02ClassBasic;

public class C0203Person {
    // 테이블 단위의 요소와 같음

    private String name; // private : 다른클래스에서 직접 접근 못하게 함
    private String email;
    private int age;
    public void eating(){
        System.out.println(this.name + "이 밥을 먹는다.");
    }

    // setting하는 메서드를 만들어서 외부에서 호출해서 사용할 수 있도록 함.
    // setter
    public void setName(String name){
        this.name = name; // name setting
    }

    // getter
    public String getName(){
        return this.name;
    }
}
