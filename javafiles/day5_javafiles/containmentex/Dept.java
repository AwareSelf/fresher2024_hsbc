package containmentex;

public class Dept {

    private int deptid;
    private String deptName;

    public Dept(int deptid, String deptName) {
        this.deptid = deptid;
        this.deptName = deptName;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "containmentex.Dept{" +
                "deptid=" + deptid +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
