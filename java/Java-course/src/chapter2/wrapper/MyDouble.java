package chapter2.wrapper;

// 직접 만든 Double 래퍼 클래스
class MyDouble {
    private final double value;

    public MyDouble(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    // 덧셈
    public MyDouble add(MyDouble other) {
        return new MyDouble(this.value + other.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

