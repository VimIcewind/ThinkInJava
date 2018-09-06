package innerclasses.ex6.ex6base;

import innerclasses.ex6.ex6interface.Ex6Interface;

public class Ex6Base {
    protected class Ex6BaseInner implements Ex6Interface {
        // need public constructor to create one in Ex6Base child:
        public Ex6BaseInner() {

        }

        @Override
        public String say() {
            return "Hi";
        }
    }
}
