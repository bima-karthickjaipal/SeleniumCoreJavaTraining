package SamplePackage1;

public abstract class AbstractSubClass extends AbstractClassCheck {

    @Override
    public void display() {
        System.out.println("Display Method declaration");
    }

    @Override
    public void tearDown() {
        System.out.println("tearDown Method declaration");

    }

    public abstract void kickOut();

    public static void main(String[]  args) {
        AbstractSubClass ab= new AbstractSubClass() {
            @Override
            public void run() {
                System.out.println("run method declaration ");
            }

            @Override
            public void chase() {
                System.out.println("chase method declaration ");
            }

            @Override
            public void kickOut() {
                System.out.println("KickOut method declaration ");
            }
        };

        ab.display();
        ab.tearDown();
        ab.kickOut();
        ab.run();
        ab.chase();

    }

}
