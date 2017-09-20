package calcpackage;

public class Optioner {
    private int oNumFirst;
    private int oNumSecond;
    private String option;
    public int getoNumFirst() {
        return oNumFirst;
    }
    public void setoNumFirst(int oNumFirst) {
        this.oNumFirst = oNumFirst;
    }
    public int getoNumSecond() {
        return oNumSecond;
    }
    public void setoNumSecond(int oNumSecond) {
        this.oNumSecond = oNumSecond;
    }
    public String getOption() {
        return option;
    }
    public void setOption(String option) {
        this.option = option;
    }
    public Optioner() {
    }
    public Optioner(int oNumFirst, int oNumSecond, String option) {
        this.oNumFirst = oNumFirst;
        this.oNumSecond = oNumSecond;
        this.option = option;
    }
    public int getReuslt() {
        int result = 0;
        switch (option) {
            case "+":
                result = oNumFirst + oNumSecond;
                break;
            case "-":
                result = oNumFirst - oNumSecond;
                break;
            case "*":
                result = oNumFirst * oNumSecond;
                break;
            case "/":
                try {
                    result = oNumFirst / oNumSecond;
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                    System.out.println("除数不能为0");
                }
                break;
        }
        return result;
    }
}
