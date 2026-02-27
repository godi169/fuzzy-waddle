package chapter2.clazz;

public class Main {
    static void main() {
        //객체 생성(인스턴스화)
        Person personA = new Person("JunYeong", 31);
        //---- personA ----;
        //- name = "JunYeong"
        //- age = 31;
        //- address = XXXX
        Person personB = new Person("Steve", 19);

        //속성에 직접 접근
        /*System.out.println("설정전 personA 이름: " + personA.name);
        System.out.println("설정전 personB 이름: " + personB.name);
        personA.name = "JunYeong";
        personB.name = "Steve";
        System.out.println("설정전 personA 이름: " + personA.name);
        System.out.println("설정전 personB 이름: " + personB.name);*/

        //기능 활용
        int result1 = personA.sum(1,2);
        int result2 = personB.sum(2,4);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        //게터 활용
        String name = personB.getName();
        System.out.println("name = " + name);

        //세터 활용
        System.out.println("personA 의 주소: " + personA.address);
        personA.setAddress("서울");
        System.out.println("personA 의 주소: " + personA.address);
    }
}
