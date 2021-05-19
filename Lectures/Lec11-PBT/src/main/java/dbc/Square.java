package dbc;

public class Square extends Rectangle {
    public void setSide(int side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setLength(int len) {
        setSide(len);
    }

    public void setWidth(int wid) {
        setSide(wid);
    }
}


