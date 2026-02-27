package Report;

public class Main {
    static void main() {
        //1가지만 출력
        /*VendingmachineEx vm = new VendingmachineEx();
        String nickname = vm.createRandomNickname();
        System.out.println(nickname);*/

        //5가지 출력
        VendingmachineEx vm = new VendingmachineEx();
        for (int i = 0; i < 5; i++) {
            System.out.println(vm.createRandomNickname());
        }

    }
}
