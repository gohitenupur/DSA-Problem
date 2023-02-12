package AssignmentWork;

class Members {
    int a;
    int b;

    Members(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSum() {
        return a + b;
    }

    public void display() {
        System.out.println("value a :" + a + " ");
        System.out.println("value b :" + b + " ");
    }
}
