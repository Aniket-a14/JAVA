public class Add {
    int a;
    int b;
    int c;

    public Add(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Add(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString(){
        return "Sum: " + (a + b + c);
    }

    public static void main(String[] args) {
        Add a1 = new Add(10, 20);
        System.out.println(a1);

        Add a2 = new Add(10,20,30);
        System.out.println(a2);
    }
}
