import java.util.ArrayList;


public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        memberList = new ArrayList<>();
    }

    // Add new club members to memberList

    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            MemberInfo newMember = new MemberInfo(name, gradYear, true);
            memberList.add(newMember);
        }
    }

    // Remove members who have graduated and return list of members who graduated and are in good standing.
    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduatedMembers = new ArrayList<>();
        ArrayList<MemberInfo> remainingMembers = new ArrayList<>();

        for (MemberInfo member : memberList) {
            if (member.getGradYear() <= year) {
                if (member.inGoodStanding()) {
                    graduatedMembers.add(member);
                }
            } else {
                remainingMembers.add(member);
            }
        }

        memberList = remainingMembers;
        return graduatedMembers;
    }

}
