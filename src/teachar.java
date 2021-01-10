public class teachar  extends user{
    int id;
    int password;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getPassword() {
        return password;
    }

    @Override
    public void setPassword(int password) {
        this.password = password;
    }
}
