package Report;

import java.util.Random;

public class VendingmachineEx {
    private String[] firstName = {"기절초풍", "멋있는", "재미있는"};
    private String[] secondName = {"도전적인", "노란색의", "바보같은"};
    private String[] thirdName = {"돌고래", "개발자", "오랑우탄"};

    public String createRandomNickname() {
        // 여기에 랜덤으로 닉네임을 만드는 코드를 적어주세요
        Random random = new Random();


        String a = firstName[random.nextInt(firstName.length)];
        String b = secondName[random.nextInt(secondName.length)];
        String c = thirdName[random.nextInt(thirdName.length)];

        return a + " " + b + " " + c; // 예: "멋있는 노란색의 개발자"
    }

}
