package C04Interface;

public class CatImplements implements Animalnterface1{

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

class CatMultiImplements implements Animalnterface1, AnimalInterface2{

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }


    @Override
    public String play(String a, String b) {
        return a+"와 " +b+ "가 같이 뛰어놉니다.";
    }

}