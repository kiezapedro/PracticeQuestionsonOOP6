public class MemberInfo {
    private String name;
    private int gradYear;
    private boolean goodStanding;

    public MemberInfo(String name, int gradYear, boolean goodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.goodStanding = goodStanding;
    }

    public int getGradYear() {
        return gradYear;
    }

    public boolean inGoodStanding() {
        return goodStanding;
    }
}
