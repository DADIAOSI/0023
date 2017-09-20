package calcpackage;

public class Optioner {
    private int oNumFirst;//第一个数
    private int oNumSecond;//第二个数
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
    public Optioner() {
    }
    public Optioner(int oNumFirst, int oNumSecond) {
        this.oNumFirst = oNumFirst;
        this.oNumSecond = oNumSecond;
    }
    public int getReuslt() {
        return 0;
    }
}
