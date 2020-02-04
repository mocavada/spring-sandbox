package moc.app.FunctionalProgramming_Advance.C_MethodReferences;

public class Square {
    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int calculateArea() {
        return sideLength*sideLength;
    }

}
