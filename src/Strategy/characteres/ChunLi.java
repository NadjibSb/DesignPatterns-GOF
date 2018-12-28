package Strategy.characteres;

import Strategy.*;

public class ChunLi extends Fighter {
    public ChunLi(KickBehavior kickBehavior,
                  JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    public void display() {
        System.out.println("ChunLi");
    }
}
