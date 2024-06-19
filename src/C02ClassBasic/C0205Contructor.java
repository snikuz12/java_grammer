package C02ClassBasic;
public class C0205Contructor {
    public static void main(String[] args) {
        // 내부 클래스 : Calendar
        // 객체변수 : year, month, day 모두 String
        // 메서드 : getter, setter 정의
            Calendar cal = new Calendar("2024","06","12");
        Calendar cal2 = new Calendar();
        Calendar cal3 = new Calendar("2024","06");
//            cal.setYear("2024");
//            cal.setMonth("06");
//            cal.setDay("12");
        System.out.println("오늘은"+ cal.getYear()+"년" + cal.getMonth()+ "월" + cal.getDay()+"일 입니다");
        // 오늘은2024년06월12일 입니다
        }
    }

    class Calendar{
        private String year;
        private String month;
        private String day;

//        // 생성자 : 클래스명과 동일, 초기화하고 싶은 변수명 나열
//        // 별도의 생성자를 만들경우, 초기 생성자를 따로 선언
        Calendar(String year, String month, String day){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        // 같은 클래스내의 다른 생성자 호출 시 this() 사용
        Calendar(){
        }
        
        Calendar(String year, String month){
             this(year, month, null); // 매개변수를 보고 알아서 찾아감
        }

        public String getYear() {
            return year;
        }

//        public void setYear(String year) {
//            this.year = year;
//        }

        public String getMonth() {
            return month;
        }

//        public void setMonth(String month) {
//            this.month = month;
//        }
        public String getDay() {
            return day;
        }

//        public void setDay(String day) {
//            this.day = day;
//        }
    }


