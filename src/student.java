public class student extends user{
        int stuID;
        int password;

    public student(int stuID, int password) {
        this.stuID = stuID;
        this.password = password;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
