package amol5;

class Outer2
{
    class Inner3 extends Outer1.Inner1
    {
        public Inner3()
        {
            super("Hi Amol");
        }
    }
    class Inner4 extends Outer1.Inner2
    {
        public Inner4()
        {
            new Outer1().super("Hi Amol");
        }
    }
}
