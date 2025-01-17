public class test {
    interface I1 {
        void f();
    }
    interface I2 {
        int f(int i);
    }
    interface I3 {
        int f();
    }
    class C {
        public int f() {
            return 1;
        }
    }
    class C2 implements I1, I2 {
        public void f() {
            
        }
        public int f(int i) {
            return 1;
        }
    }
    class C3 extends C implements I2 {
        public int f(int i) {
            return 1;
        }
    }
    class C4 extends C implements I1 {
        public int f() {
            return 1;
        }
    }

    //2 interfaces have the same method name but different return type
    class C5 extends C implements I1 {
    }

    //2 interfaces have the same method name but different return type
    interface I4 extends I1, I3{}
}